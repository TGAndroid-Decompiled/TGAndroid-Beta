package defpackage;

import org.telegram.ui.NotificationsSettingsActivity;
public final class ix implements Runnable {
    public final byte a;
    public boolean b;
    public final Object c;

    public ix(Object obj, byte b) {
        this.a = b;
        this.c = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                this.b = false;
                return;
            case 1:
                if (!this.b) {
                    this.b = true;
                    ((zu1) obj).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
            default:
                hq7 hq7Var = (hq7) obj;
                hq7Var.a(this.b);
                hq7Var.postDelayed(this, hq7Var.N);
                return;
        }
    }
}
