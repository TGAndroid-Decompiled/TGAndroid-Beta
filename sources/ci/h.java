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
    public int f4731a;
    public boolean f4732b;
    public final m f4733c;

    public h(m mVar) {
        this.f4733c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f4733c;
        e eVar = mVar.f4987c0;
        org.telegram.ui.Components.n6 n6Var = mVar.v;
        mVar.f5010w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f5010w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f5010w);
        } else {
            str = null;
        }
        n6Var.a();
        n6Var.setText(str);
        if (mVar.f5010w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        n6Var.setTextColor(i10);
        if (mVar.f5010w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f5010w < mVar.getCaptionPremiumLimit() && mVar.f5010w > this.f4731a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(n6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f5010w;
        this.f4731a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f4732b) {
            mVar.q(z10);
        }
        this.f4732b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 5));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f4733c;
        ObjectAnimator objectAnimator = mVar.f4992g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f4983a0 = mVar.f4990f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f4733c;
        g gVar = mVar.f4990f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f5012x, LaunchActivity.R(), new ai.d(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.la(mVar.O, iVar, 0, false);
                mVar.M.p(new a6.i(mVar, 11));
                ah.c cVar = mVar.f4993h0;
                if (cVar != null) {
                    i iVar2 = mVar.M;
                    ch.d c10 = cVar.c(iVar2, null, false);
                    c10.o(eh.b.i(mVar.f4982a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f4984b.addView(mVar.M, w7.x5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                gg.k1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f5012x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f5012x));
                adapter.getClass();
                adapter.f9823l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
