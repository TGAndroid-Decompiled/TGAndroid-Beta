package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class b5 extends AnimatorListenerAdapter {
    public final c5 f13739a;

    public b5(c5 c5Var) {
        this.f13739a = c5Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        c5 c5Var = this.f13739a;
        lh.c3 c3Var = c5Var.f13805f0;
        c5Var.f13815p0 = c5Var.f13814o0;
        c5Var.d(c5Var.R);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = c5Var.f13802e;
        int i10 = 2 - c5Var.f13814o0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) c5Var.T.f2802f;
        ja.Z0(c5Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - c5Var.f13814o0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) c5Var.U.f2802f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.l5 m9 = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m9.f28606m = true;
            m9.v();
        }
        AndroidUtilities.cancelRunOnUIThread(c3Var);
        AndroidUtilities.runOnUIThread(c3Var, 2500L);
    }
}
