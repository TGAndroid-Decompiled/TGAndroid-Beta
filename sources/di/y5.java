package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.j10;
import org.telegram.tgnet.tl.TL_stars;
public final class y5 extends AnimatorListenerAdapter {
    public final z5 f10070a;

    public y5(z5 z5Var) {
        this.f10070a = z5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        z5 z5Var = this.f10070a;
        ca.r rVar = z5Var.f10139p0;
        z5Var.f10154z0 = z5Var.f10153y0;
        z5Var.d(z5Var.f10122b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = z5Var.f10126e;
        int i7 = 2 - z5Var.f10153y0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) z5Var.f10125d0.f6345f;
        pb.d1(z5Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - z5Var.f10153y0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) z5Var.f10127e0.f6345f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.o5 l10 = org.telegram.ui.Components.o5.l(j10.f24770t0, 7, stargiftattributepattern.document);
            l10.f37978m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(rVar);
        org.telegram.messenger.g0.h3(rVar, 2500L);
    }
}
