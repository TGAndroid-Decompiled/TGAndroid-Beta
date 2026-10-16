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
    public int f6982a;
    public boolean f6983b;
    public final m f6984c;

    public h(m mVar) {
        this.f6984c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f6984c;
        e eVar = mVar.f7382c0;
        org.telegram.ui.Components.s6 s6Var = mVar.v;
        mVar.f7405w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f7405w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f7405w);
        } else {
            str = null;
        }
        s6Var.a();
        s6Var.setText(str);
        if (mVar.f7405w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        s6Var.setTextColor(i10);
        if (mVar.f7405w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f7405w < mVar.getCaptionPremiumLimit() && mVar.f7405w > this.f6982a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(s6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f7405w;
        this.f6982a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f6983b) {
            mVar.q(z10);
        }
        this.f6983b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new bi.la(this, 14));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f6984c;
        ObjectAnimator objectAnimator = mVar.f7387g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f7378a0 = mVar.f7385f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f6984c;
        g gVar = mVar.f7385f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f7407x, LaunchActivity.R(), new bi.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.pa(mVar.O, iVar, 0, false);
                mVar.M.p(new a6.i(mVar, 13));
                bh.b bVar = mVar.f7388h0;
                if (bVar != null) {
                    i iVar2 = mVar.M;
                    dh.d c10 = bVar.c(iVar2, null, false);
                    c10.o(fh.b.i(mVar.f7377a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f7379b.addView(mVar.M, w7.z5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                hg.j1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f7407x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f7407x));
                adapter.getClass();
                adapter.f10628l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
