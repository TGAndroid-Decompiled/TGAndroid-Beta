package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class f5 extends AnimatorListenerAdapter {
    public final g5 f8062a;

    public f5(g5 g5Var) {
        this.f8062a = g5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        g5 g5Var = this.f8062a;
        fh.o1 o1Var = g5Var.f8114e0;
        g5Var.f8125o0 = g5Var.f8124n0;
        g5Var.d(g5Var.Q);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = g5Var.f8113e;
        int i9 = 2 - g5Var.f8124n0;
        stargiftattributemodelArr[i9] = (TL_stars.starGiftAttributeModel) g5Var.S.f2897f;
        oa.Z0(g5Var.d[i9].getImageReceiver(), stargiftattributemodelArr[2 - g5Var.f8124n0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) g5Var.T.f2897f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.k5 m10 = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f29953m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(o1Var);
        AndroidUtilities.runOnUIThread(o1Var, 2500L);
    }
}
