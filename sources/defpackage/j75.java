package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class j75 implements ix0 {
    public final j95 a;

    public j75(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final void x() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        j95 j95Var = this.a;
        if (j95Var.z3 == 6) {
            SharedPreferences e1 = uc7.e1();
            if (!e1.getBoolean("reminderhint", false)) {
                e1.edit().putBoolean("reminderhint", true).commit();
                if (j95Var.g2 == null) {
                    lg5 lg5Var = new lg5(j95Var.getContext(), 8);
                    j95Var.g2 = lg5Var;
                    lg5Var.setAlpha(0.0f);
                    j95Var.g2.setVisibility(4);
                    j95Var.g2.setShowingDuration(4000L);
                    j95Var.b.addView(j95Var.g2, tre.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    j95Var.g2.setText(ob6.M0(2131743090, null));
                    j95Var.g2.b();
                }
                j95Var.g2.setExtraTranslationY(-hl.m);
                j95Var.g2.c(j95Var.v1);
            }
        }
    }

    @Override
    public final boolean y() {
        return true;
    }
}
