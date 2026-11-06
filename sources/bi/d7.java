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
        a3.f fVar = e7Var.f3781l0;
        e7Var.f3793v0 = e7Var.f3792u0;
        e7Var.d(e7Var.f3766a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = e7Var.f3772e;
        int i7 = 2 - e7Var.f3792u0;
        stargiftattributemodelArr[i7] = (TL_stars.starGiftAttributeModel) e7Var.f3770c0.f3416f;
        dd.c1(e7Var.d[i7].getImageReceiver(), stargiftattributemodelArr[2 - e7Var.f3792u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e7Var.f3771d0.f3416f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.i5 l10 = org.telegram.ui.Components.i5.l(p10.f24459s0, 7, stargiftattributepattern.document);
            l10.f34507m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(fVar);
        org.telegram.messenger.g0.i3(fVar, 2500L);
    }
}
