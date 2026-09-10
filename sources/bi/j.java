package bi;

import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class j implements TextWatcher {
    public int f2900a;
    public boolean f2901b;
    public final o f2902c;

    public j(o oVar) {
        this.f2902c = oVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10;
        boolean z10;
        o oVar = this.f2902c;
        e eVar = oVar.f3265c0;
        org.telegram.ui.Components.o6 o6Var = oVar.v;
        oVar.f3288w = Character.codePointCount(editable, 0, editable.length());
        int captionLimit = oVar.getCaptionLimit();
        if (oVar.f3288w + 25 > captionLimit) {
            str = "" + (captionLimit - oVar.f3288w);
        } else {
            str = null;
        }
        o6Var.a();
        o6Var.setText(str);
        if (oVar.f3288w >= captionLimit) {
            i10 = -1280137;
        } else {
            i10 = -1;
        }
        o6Var.setTextColor(i10);
        if (oVar.f3288w > captionLimit && !UserConfig.getInstance(oVar.U).isPremium() && oVar.f3288w < oVar.getCaptionPremiumLimit() && oVar.f3288w > this.f2900a && (oVar.e() || MessagesController.getInstance(oVar.U).premiumFeaturesBlocked())) {
            int i11 = -oVar.N;
            oVar.N = i11;
            AndroidUtilities.shakeViewSpring(o6Var, i11);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        int i12 = oVar.f3288w;
        this.f2900a = i12;
        if (i12 > captionLimit) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f2901b) {
            oVar.q(z10);
        }
        this.f2901b = z10;
        if (!oVar.V) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
            AndroidUtilities.runOnUIThread(eVar, 1500L);
        }
        oVar.V = false;
        AndroidUtilities.runOnUIThread(new a3.d(this, 11));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        o oVar = this.f2902c;
        ObjectAnimator objectAnimator = oVar.f3270g0;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return;
        }
        oVar.f3261a0 = oVar.f3268f.getEditText().getScrollY();
        oVar.W = true;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        o oVar = this.f2902c;
        i iVar = oVar.f3268f;
        if (!iVar.getEditText().suppressOnTextChanged) {
            if (oVar.M == null) {
                k kVar = new k(oVar, oVar.getContext(), oVar.f3290x, LaunchActivity.R(), new zh.b(), 0);
                oVar.M = kVar;
                oVar.T = new org.telegram.ui.Components.ma(oVar.O, kVar, 0, false);
                oVar.M.p(new a6.i(oVar, 7));
                zg.a aVar = oVar.f3271h0;
                if (aVar != null) {
                    k kVar2 = oVar.M;
                    bh.d c10 = aVar.c(kVar2, null, false);
                    c10.n(dh.c.i(oVar.f3260a));
                    kVar2.setBackgroundDrawable(c10);
                }
                oVar.f3262b.addView(oVar.M, w7.a6.e(-1, -1, 83));
                oVar.w();
            }
            if (oVar.M.getAdapter() != null) {
                fg.l1 adapter = oVar.M.getAdapter();
                MessagesController.getInstance(oVar.U).getUser(Long.valueOf(oVar.f3290x));
                TLRPC.Chat chat = MessagesController.getInstance(oVar.U).getChat(Long.valueOf(-oVar.f3290x));
                adapter.getClass();
                adapter.f8115l0 = chat;
                oVar.M.getAdapter().U(charSequence, iVar.getEditText().getSelectionStart(), null, false, false);
            }
        }
    }
}
