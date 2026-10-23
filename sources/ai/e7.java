package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class e7 extends AnimatorListenerAdapter {
    public final f7 f1217a;

    public e7(f7 f7Var) {
        this.f1217a = f7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        f7 f7Var = this.f1217a;
        a3.d dVar = f7Var.f1279l0;
        f7Var.f1291v0 = f7Var.f1290u0;
        f7Var.d(f7Var.f1265a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = f7Var.e;
        int i10 = 2 - f7Var.f1290u0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) f7Var.f1269c0.f922f;
        nd.a1(f7Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - f7Var.f1290u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) f7Var.f1270d0.f922f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f30100m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 2500L);
    }
}
