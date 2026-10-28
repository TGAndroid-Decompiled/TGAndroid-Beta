package fi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f10935a;
    public boolean f10936b;
    public final m f10937c;

    public h(m mVar) {
        this.f10937c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f10937c;
        e eVar = mVar.f11195c0;
        org.telegram.ui.Components.s6 s6Var = mVar.v;
        mVar.f11218w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f11218w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f11218w);
        } else {
            str = null;
        }
        s6Var.a();
        s6Var.setText(str);
        if (mVar.f11218w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        s6Var.setTextColor(i10);
        if (mVar.f11218w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f11218w < mVar.getCaptionPremiumLimit() && mVar.f11218w > this.f10935a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(s6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f11218w;
        this.f10935a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f10936b) {
            mVar.q(z10);
        }
        this.f10936b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new di.s8(this, 9));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f10937c;
        ObjectAnimator objectAnimator = mVar.f11200g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f11191a0 = mVar.f11198f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f10937c;
        g gVar = mVar.f11198f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f11220x, LaunchActivity.R(), new di.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.pa(mVar.O, iVar, 0, false);
                mVar.M.p(new rb.c(mVar, 20));
                ch.b bVar = mVar.f11201h0;
                if (bVar != null) {
                    i iVar2 = mVar.M;
                    eh.d c10 = bVar.c(iVar2, null, false);
                    c10.v(gh.c.i(mVar.f11190a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f11192b.addView(mVar.M, kb1.i(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                ig.j1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f11220x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f11220x));
                adapter.getClass();
                adapter.f14122l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
