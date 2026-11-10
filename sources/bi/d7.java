package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_stars;
public final class d7 extends AnimatorListenerAdapter {
    public final e7 f3677a;

    public d7(e7 e7Var) {
        this.f3677a = e7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e7 e7Var = this.f3677a;
        a3.f fVar = e7Var.f3778l0;
        e7Var.f3790v0 = e7Var.f3789u0;
        e7Var.d(e7Var.f3763a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = e7Var.f3769e;
        int i7 = 2 - e7Var.f3789u0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) e7Var.f3767c0.f3416f;
        dd.c1(e7Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - e7Var.f3789u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e7Var.f3768d0.f3416f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.h5 l10 = org.telegram.ui.Components.h5.l(p10.f24474s0, 7, stargiftattributepattern.document);
            l10.f34178m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 2500L);
    }
}
