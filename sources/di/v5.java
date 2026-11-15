package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_stars;
public final class v5 extends AnimatorListenerAdapter {
    public final w5 f9581a;

    public v5(w5 w5Var) {
        this.f9581a = w5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        w5 w5Var = this.f9581a;
        ch.w wVar = w5Var.m0;
        w5Var.f9687w0 = w5Var.f9685v0;
        w5Var.d(w5Var.f9660b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = w5Var.f9664e;
        int i7 = 2 - w5Var.f9685v0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) w5Var.f9663d0.f6062f;
        mb.c1(w5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - w5Var.f9685v0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) w5Var.f9665e0.f6062f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(m10.f24934t0, 7, stargiftattributepattern.document);
            l10.f34811m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(wVar);
        org.telegram.messenger.g0.i3(wVar, 2500L);
    }
}
