package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;
public final class f75 implements hy0 {
    public final g95 a;

    public f75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void w() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        g95 g95Var = this.a;
        if (g95Var.z3 == 6) {
            SharedPreferences d1 = oc7.d1();
            if (!d1.getBoolean("reminderhint", false)) {
                d1.edit().putBoolean("reminderhint", true).commit();
                if (g95Var.g2 == null) {
                    ig5 ig5Var = new ig5(g95Var.getContext(), 8);
                    g95Var.g2 = ig5Var;
                    ig5Var.setAlpha(0.0f);
                    g95Var.g2.setVisibility(4);
                    g95Var.g2.setShowingDuration(4000L);
                    g95Var.b.addView(g95Var.g2, qoe.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    g95Var.g2.setText(jb6.M0(2131743122, null));
                    g95Var.g2.b();
                }
                g95Var.g2.setExtraTranslationY(-gm.m);
                g95Var.g2.c(g95Var.v1);
            }
        }
    }

    @Override
    public final boolean x() {
        return true;
    }
}
