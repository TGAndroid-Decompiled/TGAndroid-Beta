package defpackage;

import org.telegram.ui.LaunchActivity;
public final class ay5 implements Runnable {
    public final byte a;
    public final kz5 b;

    public ay5(kz5 kz5Var, byte b) {
        this.a = b;
        this.b = kz5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kz5 kz5Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    kz5Var.run();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    kz5Var.run();
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
        }
    }
}
