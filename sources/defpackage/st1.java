package defpackage;

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ThemeActivity;
public final class st1 implements Runnable {
    public final byte a;
    public final ju1 b;

    public st1(ju1 ju1Var, byte b) {
        this.a = b;
        this.b = ju1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ju1 ju1Var = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = ju1Var.a;
                zu1Var.v5 = null;
                zu1Var.w5 = null;
                return;
            case 1:
                zu1 zu1Var2 = ju1Var.a;
                new xk8((e) zu1Var2, 8, true).show();
                zu1Var2.getMessagesController().O3();
                return;
            case 2:
                zu1 zu1Var3 = ju1Var.a;
                new xk8((e) zu1Var3, 8, true).show();
                zu1Var3.getMessagesController().O3();
                return;
            case 3:
                zu1 zu1Var4 = ju1Var.a;
                new xk8((e) zu1Var4, 8, true).show();
                zu1Var4.getMessagesController().O3();
                return;
            case 4:
                ju1Var.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                zu1 zu1Var5 = ju1Var.a;
                zu1Var5.v5 = null;
                zu1Var5.w5 = null;
                return;
            case 6:
                ju1Var.a.a0.o1();
                return;
            case 7:
                ju1Var.a.a0.o1();
                return;
            case 8:
                zu1 zu1Var6 = ju1Var.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                zu1Var6.presentFragment(themeActivity);
                return;
            default:
                zu1 zu1Var7 = ju1Var.a;
                zu1Var7.showDialog(new xk8((e) zu1Var7, 39, false));
                return;
        }
    }
}
