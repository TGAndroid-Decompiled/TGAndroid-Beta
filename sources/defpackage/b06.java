package defpackage;

import org.telegram.ui.LaunchActivity;
public final class b06 implements Runnable {
    public final byte a;
    public final tg5 b;

    public b06(tg5 tg5Var, byte b) {
        this.a = b;
        this.b = tg5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tg5 tg5Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                try {
                    tg5Var.run();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                String str2 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            default:
                String str3 = LaunchActivity.C1;
                try {
                    tg5Var.run();
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
        }
    }
}
