package fi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f10936a;
    public boolean f10937b;
    public final m f10938c;

    public h(m mVar) {
        this.f10938c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f10938c;
        e eVar = mVar.f11196c0;
        org.telegram.ui.Components.s6 s6Var = mVar.v;
        mVar.f11219w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f11219w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f11219w);
        } else {
            str = null;
        }
        s6Var.a();
        s6Var.setText(str);
        if (mVar.f11219w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        s6Var.setTextColor(i10);
        if (mVar.f11219w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f11219w < mVar.getCaptionPremiumLimit() && mVar.f11219w > this.f10936a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(s6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f11219w;
        this.f10936a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f10937b) {
            mVar.q(z10);
        }
        this.f10937b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new di.s8(this, 9));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f10938c;
        ObjectAnimator objectAnimator = mVar.f11201g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f11192a0 = mVar.f11199f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f10938c;
        g gVar = mVar.f11199f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f11221x, LaunchActivity.R(), new di.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.pa(mVar.O, iVar, 0, false);
                mVar.M.p(new rb.c(mVar, 20));
                ch.b bVar = mVar.f11202h0;
                if (bVar != null) {
                    i iVar2 = mVar.M;
                    eh.d c10 = bVar.c(iVar2, null, false);
                    c10.v(gh.c.i(mVar.f11191a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f11193b.addView(mVar.M, gb1.i(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                ig.j1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f11221x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f11221x));
                adapter.getClass();
                adapter.f14123l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
