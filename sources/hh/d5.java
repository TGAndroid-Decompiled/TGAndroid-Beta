package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

public final class d5 extends AnimatorListenerAdapter {

    public final e5 f9125a;

    public d5(e5 e5Var) {
        this.f9125a = e5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e5 e5Var = this.f9125a;
        f2.r rVar = e5Var.f9180e0;
        e5Var.f9191o0 = e5Var.f9190n0;
        e5Var.d(e5Var.Q);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = e5Var.f9179e;
        int i10 = 2 - e5Var.f9190n0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) e5Var.S.f3342f;
        oa.Z0(e5Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - e5Var.f9190n0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e5Var.T.f3342f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.k5 k5VarM = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            k5VarM.f29963m = true;
            k5VarM.v();
        }
        AndroidUtilities.cancelRunOnUIThread(rVar);
        AndroidUtilities.runOnUIThread(rVar, 2500L);
    }
}
