package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.k10;
import org.telegram.tgnet.tl.TL_stars;
public final class y5 extends AnimatorListenerAdapter {
    public final z5 f10076a;

    public y5(z5 z5Var) {
        this.f10076a = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        z5 z5Var = this.f10076a;
        ca.r rVar = z5Var.f10163p0;
        z5Var.f10178z0 = z5Var.f10177y0;
        z5Var.d(z5Var.f10146b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = z5Var.f10150e;
        int i7 = 2 - z5Var.f10177y0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) z5Var.f10149d0.f6377f;
        pb.d1(z5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - z5Var.f10177y0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) z5Var.f10151e0.f6377f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(k10.f24968t0, 7, stargiftattributepattern.document);
            l10.f38502m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
    }
}
