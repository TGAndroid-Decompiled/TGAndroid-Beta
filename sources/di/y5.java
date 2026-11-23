package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.k10;
import org.telegram.tgnet.tl.TL_stars;
public final class y5 extends AnimatorListenerAdapter {
    public final z5 f10039a;

    public y5(z5 z5Var) {
        this.f10039a = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        z5 z5Var = this.f10039a;
        ca.r rVar = z5Var.f10126p0;
        z5Var.f10141z0 = z5Var.f10140y0;
        z5Var.d(z5Var.f10109b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = z5Var.f10113e;
        int i7 = 2 - z5Var.f10140y0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) z5Var.f10112d0.f6340f;
        pb.d1(z5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - z5Var.f10140y0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) z5Var.f10114e0.f6340f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(k10.f24932t0, 7, stargiftattributepattern.document);
            l10.f38459m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
    }
}
