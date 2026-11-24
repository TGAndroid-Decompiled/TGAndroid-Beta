package defpackage;

import org.telegram.ui.NotificationsSettingsActivity;
public final class iy implements Runnable {
    public final byte a;
    public boolean b;
    public final Object c;

    public iy(Object obj, byte b) {
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
                    ((yv1) obj).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
            default:
                lp7 lp7Var = (lp7) obj;
                lp7Var.a(this.b);
                lp7Var.postDelayed(this, lp7Var.N);
                return;
        }
    }
}
