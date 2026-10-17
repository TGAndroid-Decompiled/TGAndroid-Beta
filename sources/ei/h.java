package ei;

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
    public int f9141a;
    public boolean f9142b;
    public final m f9143c;

    public h(m mVar) {
        this.f9143c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f9143c;
        e eVar = mVar.f9398c0;
        org.telegram.ui.Components.q6 q6Var = mVar.v;
        mVar.f9421w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f9421w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f9421w);
        } else {
            str = null;
        }
        q6Var.a();
        q6Var.setText(str);
        if (mVar.f9421w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        q6Var.setTextColor(i10);
        if (mVar.f9421w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f9421w < mVar.getCaptionPremiumLimit() && mVar.f9421w > this.f9141a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(q6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f9421w;
        this.f9141a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f9142b) {
            mVar.q(z10);
        }
        this.f9142b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(this, 5));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f9143c;
        ObjectAnimator objectAnimator = mVar.f9403g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f9394a0 = mVar.f9401f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f9143c;
        g gVar = mVar.f9401f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f9423x, LaunchActivity.R(), new ci.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.na(mVar.O, iVar, 0, false);
                mVar.M.p(new ya.c(mVar, 15));
                bh.b bVar = mVar.f9404h0;
                if (bVar != null) {
                    i iVar2 = mVar.M;
                    dh.d c10 = bVar.c(iVar2, null, false);
                    c10.o(fh.c.i(mVar.f9393a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f9395b.addView(mVar.M, w7.z5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                hg.j1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f9423x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f9423x));
                adapter.getClass();
                adapter.f11933l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
