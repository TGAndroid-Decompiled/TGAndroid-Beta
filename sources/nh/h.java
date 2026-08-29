package nh;

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
    public int f17822a;
    public boolean f17823b;
    public final m f17824c;

    public h(m mVar) {
        this.f17824c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f17824c;
        e eVar = mVar.V;
        org.telegram.ui.Components.o6 o6Var = mVar.v;
        mVar.f18096w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f18096w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f18096w);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        if (mVar.f18096w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        o6Var.setTextColor(i10);
        if (mVar.f18096w > captionLimit && !UserConfig.getInstance(mVar.Q).isPremium() && mVar.f18096w < mVar.getCaptionPremiumLimit() && mVar.f18096w > this.f17822a && (mVar.e() || MessagesController.getInstance(mVar.Q).premiumFeaturesBlocked())) {
            int i11 = -mVar.J;
            mVar.J = i11;
            AndroidUtilities.shakeViewSpring(o6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f18096w;
        this.f17822a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f17823b) {
            mVar.q(z10);
        }
        this.f17823b = z10;
        if (!mVar.R) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.R = false;
        AndroidUtilities.runOnUIThread(new lh.m5(this, 16));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f17824c;
        ObjectAnimator objectAnimator = mVar.f18072c0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.T = mVar.f18076f.getEditText().getScrollY();
        mVar.S = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f17824c;
        g gVar = mVar.f18076f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.I == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f18098x, LaunchActivity.R(), new lh.b(), 0);
                mVar.I = iVar;
                mVar.P = new org.telegram.ui.Components.ka(mVar.K, iVar, 0, false);
                mVar.I.p(new za.c(mVar, 29));
                lg.a aVar = mVar.f18073d0;
                if (aVar != null) {
                    i iVar2 = mVar.I;
                    ng.d c3 = aVar.c(iVar2, null, false);
                    c3.n(pg.a.i(mVar.f18067a));
                    iVar2.setBackgroundDrawable(c3);
                }
                mVar.f18069b.addView(mVar.I, i7.f6.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.I.getAdapter() != null) {
                rf.v0 adapter = mVar.I.getAdapter();
                MessagesController.getInstance(mVar.Q).getUser(Long.valueOf(mVar.f18098x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.Q).getChat(Long.valueOf(-mVar.f18098x));
                adapter.getClass();
                adapter.f47372h0 = chat;
                mVar.I.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
