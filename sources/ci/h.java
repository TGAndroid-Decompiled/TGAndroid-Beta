package ci;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class h implements TextWatcher {
    public int f4737a;
    public boolean f4738b;
    public final m f4739c;

    public h(m mVar) {
        this.f4739c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f4739c;
        e eVar = mVar.f4993c0;
        org.telegram.ui.Components.o6 o6Var = mVar.v;
        mVar.f5016w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f5016w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f5016w);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        if (mVar.f5016w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        o6Var.setTextColor(i10);
        if (mVar.f5016w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f5016w < mVar.getCaptionPremiumLimit() && mVar.f5016w > this.f4737a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(o6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f5016w;
        this.f4737a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f4738b) {
            mVar.q(z10);
        }
        this.f4738b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 5));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f4739c;
        ObjectAnimator objectAnimator = mVar.f4998g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f4989a0 = mVar.f4996f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f4739c;
        g gVar = mVar.f4996f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f5018x, LaunchActivity.R(), new ai.d(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.ma(mVar.O, iVar, 0, false);
                mVar.M.p(new a6.i(mVar, 11));
                ah.c cVar = mVar.f4999h0;
                if (cVar != null) {
                    i iVar2 = mVar.M;
                    ch.d c10 = cVar.c(iVar2, null, false);
                    c10.o(eh.b.i(mVar.f4988a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f4990b.addView(mVar.M, w7.y5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                gg.k1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f5018x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f5018x));
                adapter.getClass();
                adapter.f9828l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
