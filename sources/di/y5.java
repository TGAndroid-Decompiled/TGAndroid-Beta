package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.i10;
import org.telegram.tgnet.tl.TL_stars;
public final class y5 extends AnimatorListenerAdapter {
    public final z5 f10037a;

    public y5(z5 z5Var) {
        this.f10037a = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        z5 z5Var = this.f10037a;
        ca.r rVar = z5Var.f10124p0;
        z5Var.f10139z0 = z5Var.f10138y0;
        z5Var.d(z5Var.f10107b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = z5Var.f10111e;
        int i7 = 2 - z5Var.f10138y0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) z5Var.f10110d0.f6337f;
        pb.d1(z5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - z5Var.f10138y0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) z5Var.f10112e0.f6337f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(i10.f24637t0, 7, stargiftattributepattern.document);
            l10.f38030m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
    }
}
