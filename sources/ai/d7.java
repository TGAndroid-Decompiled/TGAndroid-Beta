package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class d7 extends AnimatorListenerAdapter {
    public final e7 f1163a;

    public d7(e7 e7Var) {
        this.f1163a = e7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        e7 e7Var = this.f1163a;
        a3.d dVar = e7Var.f1227j0;
        e7Var.f1239t0 = e7Var.f1238s0;
        e7Var.d(e7Var.V);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = e7Var.e;
        int i10 = 2 - e7Var.f1238s0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) e7Var.f1215a0.f923f;
        md.a1(e7Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - e7Var.f1238s0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e7Var.f1217b0.f923f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f29844m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 2500L);
    }
}
