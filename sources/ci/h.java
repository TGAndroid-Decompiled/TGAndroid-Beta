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
    public int f4733a;
    public boolean f4734b;
    public final m f4735c;

    public h(m mVar) {
        this.f4735c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f4735c;
        e eVar = mVar.f4989c0;
        org.telegram.ui.Components.n6 n6Var = mVar.v;
        mVar.f5012w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f5012w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f5012w);
        } else {
            str = null;
        }
        n6Var.a();
        n6Var.setText(str);
        if (mVar.f5012w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        n6Var.setTextColor(i10);
        if (mVar.f5012w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f5012w < mVar.getCaptionPremiumLimit() && mVar.f5012w > this.f4733a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(n6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f5012w;
        this.f4733a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f4734b) {
            mVar.q(z10);
        }
        this.f4734b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 5));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f4735c;
        ObjectAnimator objectAnimator = mVar.f4994g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f4985a0 = mVar.f4992f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f4735c;
        g gVar = mVar.f4992f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f5014x, LaunchActivity.R(), new ai.d(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.la(mVar.O, iVar, 0, false);
                mVar.M.p(new a6.i(mVar, 11));
                ah.c cVar = mVar.f4995h0;
                if (cVar != null) {
                    i iVar2 = mVar.M;
                    ch.d c10 = cVar.c(iVar2, null, false);
                    c10.o(eh.b.i(mVar.f4984a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f4986b.addView(mVar.M, w7.x5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                gg.k1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f5014x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f5014x));
                adapter.getClass();
                adapter.f9824l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
