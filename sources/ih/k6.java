package ih;

import org.telegram.messenger.NotificationCenter;
public final class k6 implements Runnable {
    public final int f11683a;
    public final n6 f11684b;

    public k6(n6 n6Var, int i9) {
        this.f11683a = i9;
        this.f11684b = n6Var;
    }

    @Override
    public final void run() {
        int i9 = this.f11683a;
        n6 n6Var = this.f11684b;
        switch (i9) {
            case 0:
                NotificationCenter.getInstance(n6Var.f11847c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, n6Var);
                return;
            case 1:
                n6Var.f11863u = false;
                n6Var.f11864w = true;
                NotificationCenter.getInstance(n6Var.f11847c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, n6Var, Boolean.FALSE);
                return;
            case 2:
                n6Var.f11867z = false;
                return;
            default:
                n6Var.f11853k.clear();
                n6Var.d(true);
                return;
        }
    }
}
