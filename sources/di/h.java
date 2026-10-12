package di;

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
    public int f6979a;
    public boolean f6980b;
    public final m f6981c;

    public h(m mVar) {
        this.f6981c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f6981c;
        e eVar = mVar.f7379c0;
        org.telegram.ui.Components.s6 s6Var = mVar.v;
        mVar.f7402w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f7402w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f7402w);
        } else {
            str = null;
        }
        s6Var.a();
        s6Var.setText(str);
        if (mVar.f7402w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        s6Var.setTextColor(i10);
        if (mVar.f7402w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f7402w < mVar.getCaptionPremiumLimit() && mVar.f7402w > this.f6979a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(s6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f7402w;
        this.f6979a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f6980b) {
            mVar.q(z10);
        }
        this.f6980b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new bi.la(this, 14));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f6981c;
        ObjectAnimator objectAnimator = mVar.f7384g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f7375a0 = mVar.f7382f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f6981c;
        g gVar = mVar.f7382f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f7404x, LaunchActivity.R(), new bi.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.pa(mVar.O, iVar, 0, false);
                mVar.M.p(new a6.i(mVar, 13));
                bh.b bVar = mVar.f7385h0;
                if (bVar != null) {
                    i iVar2 = mVar.M;
                    dh.d c10 = bVar.c(iVar2, null, false);
                    c10.o(fh.b.i(mVar.f7374a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f7376b.addView(mVar.M, w7.a6.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                hg.j1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f7404x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f7404x));
                adapter.getClass();
                adapter.f10624l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
