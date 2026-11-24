package defpackage;

import org.telegram.ui.NotificationsSettingsActivity;
public final class hx implements Runnable {
    public final byte a;
    public boolean b;
    public final Object c;

    public hx(Object obj, byte b) {
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
                    ((mu1) obj).presentFragment(new NotificationsSettingsActivity());
                    return;
                }
                return;
            default:
                hn7 hn7Var = (hn7) obj;
                hn7Var.a(this.b);
                hn7Var.postDelayed(this, hn7Var.N);
                return;
        }
    }
}
