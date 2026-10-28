package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
public final class a7 extends AnimatorListenerAdapter {
    public final b7 f4263a;

    public a7(b7 b7Var) {
        this.f4263a = b7Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        b7 b7Var = this.f4263a;
        u6 u6Var = b7Var.f4358l0;
        b7Var.f4370v0 = b7Var.f4369u0;
        b7Var.d(b7Var.f4344a0);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = b7Var.e;
        int i10 = 2 - b7Var.f4369u0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) b7Var.f4348c0.f4245f;
        dd.Y0(b7Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - b7Var.f4369u0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) b7Var.f4349d0.f4245f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.t5 m10 = org.telegram.ui.Components.t5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.f32862m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        AndroidUtilities.runOnUIThread(u6Var, 2500L);
    }
}
