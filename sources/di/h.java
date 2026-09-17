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
    public int f7308a;
    public boolean f7309b;
    public final m f7310c;

    public h(m mVar) {
        this.f7310c = mVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        m mVar = this.f7310c;
        e eVar = mVar.f7589c0;
        org.telegram.ui.Components.q6 q6Var = mVar.v;
        mVar.f7613w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = mVar.getCaptionLimit();
        if (mVar.f7613w + 25 > captionLimit) {
            str = "" + (captionLimit - mVar.f7613w);
        } else {
            str = null;
        }
        q6Var.a();
        q6Var.setText(str);
        if (mVar.f7613w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        q6Var.setTextColor(i10);
        if (mVar.f7613w > captionLimit && !UserConfig.getInstance(mVar.U).isPremium() && mVar.f7613w < mVar.getCaptionPremiumLimit() && mVar.f7613w > this.f7308a && (mVar.e() || MessagesController.getInstance(mVar.U).premiumFeaturesBlocked())) {
            int i11 = -mVar.N;
            mVar.N = i11;
            AndroidUtilities.shakeViewSpring(q6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = mVar.f7613w;
        this.f7308a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f7309b) {
            mVar.q(z10);
        }
        this.f7309b = z10;
        if (!mVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        mVar.V = false;
        AndroidUtilities.runOnUIThread(new bi.oa(this, 11));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f7310c;
        ObjectAnimator objectAnimator = mVar.f7595g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        mVar.f7585a0 = mVar.f7593f.getEditText().getScrollY();
        mVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        m mVar = this.f7310c;
        g gVar = mVar.f7593f;
        if (!gVar.getEditText().suppressOnTextChanged) {
            if (mVar.M == null) {
                i iVar = new i(mVar, mVar.getContext(), mVar.f7615x, LaunchActivity.R(), new bi.b(), 0);
                mVar.M = iVar;
                mVar.T = new org.telegram.ui.Components.na(mVar.O, iVar, 0, false);
                mVar.M.p(new a6.i(mVar, 15));
                bh.b bVar = mVar.f7596h0;
                if (bVar != null) {
                    i iVar2 = mVar.M;
                    dh.d c10 = bVar.c(iVar2, null, false);
                    c10.n(fh.b.i(mVar.f7584a));
                    iVar2.setBackgroundDrawable(c10);
                }
                mVar.f7586b.addView(mVar.M, w7.x5.e(-1, -1, 83));
                mVar.w();
            }
            if (mVar.M.getAdapter() != null) {
                hg.k1 adapter = mVar.M.getAdapter();
                MessagesController.getInstance(mVar.U).getUser(Long.valueOf(mVar.f7615x));
                TLRPC.Chat chat = MessagesController.getInstance(mVar.U).getChat(Long.valueOf(-mVar.f7615x));
                adapter.getClass();
                adapter.f11142l0 = chat;
                mVar.M.getAdapter().U(charSequence, gVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
