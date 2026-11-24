package defpackage;

import org.telegram.ui.LaunchActivity;
public final class zz5 implements Runnable {
    public final byte a;
    public final k16 b;

    public zz5(k16 k16Var, byte b) {
        this.a = b;
        this.b = k16Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        k16 k16Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    k16Var.run();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    k16Var.run();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    k16Var.run();
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
        }
    }
}
