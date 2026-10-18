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
    public int f9142a;
    public boolean f9143b;
    public final m f9144c;

    public h(m mVar) {
        this.f9144c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f9144c;
        e eVar = mVar.f9399c0;
        org.telegram.ui.Components.q6 q6Var = mVar.v;
        mVar.f9422w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f9422w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f9422w);
        } else {
            str = null;
        }
        q6Var.a();
        q6Var.setText(str);
        if (mVar.f9422w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        q6Var.setTextColor(i10);
        if (mVar.f9422w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f9422w < mVar.getCaptionPremiumLimit() && mVar.f9422w > this.f9142a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(q6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f9422w;
        this.f9142a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f9143b) {
            mVar.q(z10);
        }
        this.f9143b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(this, 5));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f9144c;
        ObjectAnimator objectAnimator = mVar.f9404g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f9395a0 = mVar.f9402f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f9144c;
        g gVar = mVar.f9402f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f9424x, LaunchActivity.R(), new ci.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.na(mVar.O, iVar, 0, false);
                mVar.M.p(new ya.c(mVar, 15));
                bh.b bVar = mVar.f9405h0;
                if (bVar != null) {
                    i iVar2 = mVar.M;
                    dh.d c10 = bVar.c(iVar2, null, false);
                    c10.o(fh.c.i(mVar.f9394a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f9396b.addView(mVar.M, w7.z5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                hg.j1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f9424x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f9424x));
                adapter.getClass();
                adapter.f11935l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
