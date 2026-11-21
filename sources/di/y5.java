package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.tgnet.tl.TL_stars;
public final class y5 extends AnimatorListenerAdapter {
    public final z5 f10073a;

    public y5(z5 z5Var) {
        this.f10073a = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        z5 z5Var = this.f10073a;
        ca.r rVar = z5Var.f10160p0;
        z5Var.f10175z0 = z5Var.f10174y0;
        z5Var.d(z5Var.f10143b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = z5Var.f10147e;
        int i7 = 2 - z5Var.f10174y0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) z5Var.f10146d0.f6374f;
        pb.d1(z5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - z5Var.f10174y0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) z5Var.f10148e0.f6374f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 l10 = org.telegram.ui.Components.p5.l(j10.f24798t0, 7, stargiftattributepattern.document);
            l10.f38503m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
    }
}
