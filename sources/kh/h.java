package kh;

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
    public int f15383a;
    public boolean f15384b;
    public final m f15385c;

    public h(m mVar) {
        this.f15385c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i9;
        boolean z10;
        m mVar = this.f15385c;
        e eVar = mVar.V;
        org.telegram.ui.Components.j6 j6Var = mVar.v;
        mVar.f15652w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f15652w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f15652w);
        } else {
            str = null;
        }
        j6Var.a();
        j6Var.setText(str);
        if (mVar.f15652w >= captionLimit) {
            i9 = -1280137;
        } else {
            i9 = -1;
        }
        j6Var.setTextColor(i9);
        if (mVar.f15652w > captionLimit && !UserConfig.getInstance(mVar.Q).isPremium() && mVar.f15652w < mVar.getCaptionPremiumLimit() && mVar.f15652w > this.f15383a && (mVar.e() || MessagesController.getInstance(mVar.Q).premiumFeaturesBlocked())) {
            int i10 = -mVar.J;
            mVar.J = i10;
            AndroidUtilities.shakeViewSpring(j6Var, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i11 = mVar.f15652w;
        this.f15383a = i11;
        if (i11 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f15384b) {
            mVar.q(z10);
        }
        this.f15384b = z10;
        if (!mVar.R) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.R = false;
        AndroidUtilities.runOnUIThread(new ih.g(this, 25));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        m mVar = this.f15385c;
        ObjectAnimator objectAnimator = mVar.f15628c0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.T = mVar.f15632f.getEditText().getScrollY();
        mVar.S = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        m mVar = this.f15385c;
        g gVar = mVar.f15632f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.I == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f15654x, LaunchActivity.R(), new ih.b(), 0);
                mVar.I = iVar;
                mVar.P = new org.telegram.ui.Components.fa(mVar.K, iVar, 0, false);
                mVar.I.p(new android.support.v4.media.c(mVar, 21));
                ig.a aVar = mVar.f15629d0;
                if (aVar != null) {
                    i iVar2 = mVar.I;
                    kg.d c10 = aVar.c(iVar2, null, false);
                    c10.n(mg.c.i(mVar.f15623a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f15625b.addView(mVar.I, g7.e6.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.I.getAdapter() != null) {
                of.f1 adapter = mVar.I.getAdapter();
                MessagesController.getInstance(mVar.Q).getUser(Long.valueOf(mVar.f15654x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.Q).getChat(Long.valueOf(-mVar.f15654x));
                adapter.getClass();
                adapter.f19330h0 = chat;
                mVar.I.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
