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
    public int f5142a;
    public boolean f5143b;
    public final m f5144c;

    public h(m mVar) {
        this.f5144c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f5144c;
        e eVar = mVar.f5549c0;
        org.telegram.ui.Components.r6 r6Var = mVar.v;
        mVar.f5573w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f5573w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f5573w);
        } else {
            str = null;
        }
        r6Var.a();
        r6Var.setText(str);
        if (mVar.f5573w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        r6Var.setTextColor(i10);
        if (mVar.f5573w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f5573w < mVar.getCaptionPremiumLimit() && mVar.f5573w > this.f5142a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(r6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f5573w;
        this.f5142a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f5143b) {
            mVar.q(z10);
        }
        this.f5143b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 5));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f5144c;
        ObjectAnimator objectAnimator = mVar.f5555g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f5545a0 = mVar.f5553f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f5144c;
        g gVar = mVar.f5553f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f5575x, LaunchActivity.R(), new ai.d(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.pa(mVar.O, iVar, 0, false);
                mVar.M.p(new xa.c(mVar, 9));
                ah.c cVar = mVar.f5556h0;
                if (cVar != null) {
                    i iVar2 = mVar.M;
                    ch.d c10 = cVar.c(iVar2, null, false);
                    c10.o(eh.b.i(mVar.f5544a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f5546b.addView(mVar.M, w7.w5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                gg.j1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f5575x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f5575x));
                adapter.getClass();
                adapter.f10678l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
