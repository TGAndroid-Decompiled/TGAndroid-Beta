package defpackage;

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class ft1 implements Runnable {
    public final byte a;
    public final wt1 b;

    public ft1(wt1 wt1Var, byte b) {
        this.a = b;
        this.b = wt1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wt1 wt1Var = this.b;
        switch (b) {
            case 0:
                mu1 mu1Var = wt1Var.a;
                mu1Var.v5 = null;
                mu1Var.w5 = null;
                return;
            case 1:
                mu1 mu1Var2 = wt1Var.a;
                new jh8((d) mu1Var2, 8, true).show();
                mu1Var2.getMessagesController().G3();
                return;
            case 2:
                mu1 mu1Var3 = wt1Var.a;
                new jh8((d) mu1Var3, 8, true).show();
                mu1Var3.getMessagesController().G3();
                return;
            case 3:
                mu1 mu1Var4 = wt1Var.a;
                new jh8((d) mu1Var4, 8, true).show();
                mu1Var4.getMessagesController().G3();
                return;
            case 4:
                wt1Var.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                mu1 mu1Var5 = wt1Var.a;
                mu1Var5.v5 = null;
                mu1Var5.w5 = null;
                return;
            case 6:
                wt1Var.a.a0.h1();
                return;
            case 7:
                wt1Var.a.a0.h1();
                return;
            case 8:
                mu1 mu1Var6 = wt1Var.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                mu1Var6.presentFragment(themeActivity);
                return;
            default:
                mu1 mu1Var7 = wt1Var.a;
                mu1Var7.showDialog(new jh8((d) mu1Var7, 39, false));
                return;
        }
    }
}
