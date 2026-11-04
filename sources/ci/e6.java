package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.h10;
import org.telegram.tgnet.tl.TL_stars;
public final class e6 extends AnimatorListenerAdapter {
    public final f6 f5015a;

    public e6(f6 f6Var) {
        this.f5015a = f6Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f6 f6Var = this.f5015a;
        d1 d1Var = f6Var.m0;
        f6Var.f5113w0 = f6Var.f5111v0;
        f6Var.d(f6Var.f5086b0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = f6Var.f5090e;
        int i3 = 2 - f6Var.f5111v0;
        stargiftattributemodelArr[i3] = (TL_stars.starGiftAttributeModel) f6Var.f5089d0.f4786f;
        wb.c1(f6Var.d[i3].getImageReceiver(), stargiftattributemodelArr[2 - f6Var.f5111v0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) f6Var.f5091e0.f4786f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(h10.f22829t0, 7, stargiftattributepattern.document);
            l10.f33973m = true;
            l10.u();
        }
        org.telegram.messenger.g0.r(d1Var);
        org.telegram.messenger.g0.i3(d1Var, 2500L);
    }
}
