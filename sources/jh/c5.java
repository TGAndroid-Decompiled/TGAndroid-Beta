package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class c5 extends AnimatorListenerAdapter {
    public final d5 f11864a;

    public c5(d5 d5Var) {
        this.f11864a = d5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        d5 d5Var = this.f11864a;
        o oVar = d5Var.f11913e0;
        d5Var.f11924o0 = d5Var.f11923n0;
        d5Var.d(d5Var.Q);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = d5Var.f11912e;
        int i10 = 2 - d5Var.f11923n0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) d5Var.S.f3911f;
        ia.Z0(d5Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - d5Var.f11923n0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) d5Var.T.f3911f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f31595m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(oVar);
        AndroidUtilities.runOnUIThread(oVar, 2500L);
    }
}
