package ai;

import org.telegram.messenger.NotificationCenter;
public final class y8 implements Runnable {
    public final int f1765a;
    public final d9 f1766b;

    public y8(d9 d9Var, int i10) {
        this.f1765a = i10;
        this.f1766b = d9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f1765a;
        d9 d9Var = this.f1766b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(d9Var.f718c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                return;
            case 1:
                d9Var.f733u = false;
                d9Var.f734w = true;
                NotificationCenter.getInstance(d9Var.f718c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var, Boolean.FALSE);
                return;
            case 2:
                d9Var.f737z = false;
                return;
            default:
                d9Var.f723k.clear();
                d9Var.d(true);
                return;
        }
    }
}
