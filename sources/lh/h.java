package lh;

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

    public int f16049a;

    public boolean f16050b;

    public final m f16051c;

    public h(m mVar) {
        this.f16051c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        m mVar = this.f16051c;
        e eVar = mVar.V;
        org.telegram.ui.Components.j6 j6Var = mVar.v;
        mVar.f16358w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f16358w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f16358w);
        } else {
            str = null;
        }
        j6Var.a();
        j6Var.setText(str);
        j6Var.setTextColor(mVar.f16358w >= captionLimit ? -1280137 : -1);
        if (mVar.f16358w > captionLimit && !UserConfig.getInstance(mVar.Q).isPremium() && mVar.f16358w < mVar.getCaptionPremiumLimit() && mVar.f16358w > this.f16049a && (mVar.e() || MessagesController.getInstance(mVar.Q).premiumFeaturesBlocked())) {
            int i10 = -mVar.J;
            mVar.J = i10;
            AndroidUtilities.shakeViewSpring(j6Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i11 = mVar.f16358w;
        this.f16049a = i11;
        boolean z10 = i11 > captionLimit;
        if (z10 != this.f16050b) {
            mVar.q(z10);
        }
        this.f16050b = z10;
        if (!mVar.R) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.R = false;
        AndroidUtilities.runOnUIThread(new kh.c(this, 2));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f16051c;
        ObjectAnimator objectAnimator = mVar.f16334c0;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            mVar.T = mVar.f16338f.getEditText().getScrollY();
            mVar.S = true;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f16051c;
        g gVar = mVar.f16338f;
        if (gVar.getEditText().suppressOnTextChanged) {
            return;
        }
        if (mVar.I == null) {
            i iVar = new i(mVar, mVar.getContext(), mVar.f16360x, LaunchActivity.R(), new jh.b(), 0);
            mVar.I = iVar;
            mVar.P = new org.telegram.ui.Components.da(mVar.K, iVar, 0, false);
            mVar.I.p(new a9.i(mVar, 25));
            jg.a aVar = mVar.f16335d0;
            if (aVar != null) {
                i iVar2 = mVar.I;
                lg.d dVarC = aVar.c(iVar2, null, false);
                dVarC.n(ng.c.i(mVar.f16329a));
                iVar2.setBackgroundDrawable(dVarC);
            }
            mVar.f16331b.addView(mVar.I, h7.z5.e(-1, -1, 83));
            mVar.w();
        }
        if (mVar.I.getAdapter() != null) {
            pf.u0 adapter = mVar.I.getAdapter();
            MessagesController.getInstance(mVar.Q).getUser(Long.valueOf(mVar.f16360x));
            TLRPC.Chat chat = MessagesController.getInstance(mVar.Q).getChat(Long.valueOf(-mVar.f16360x));
            adapter.getClass();
            adapter.f45931h0 = chat;
            mVar.I.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
        }
    }
}
