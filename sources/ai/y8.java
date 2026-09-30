package ai;

import org.telegram.messenger.NotificationCenter;
public final class y8 implements Runnable {
    public final int f1766a;
    public final d9 f1767b;

    public y8(d9 d9Var, int i10) {
        this.f1766a = i10;
        this.f1767b = d9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f1766a;
        d9 d9Var = this.f1767b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(d9Var.f722c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                return;
            case 1:
                d9Var.f737u = false;
                d9Var.f738w = true;
                NotificationCenter.getInstance(d9Var.f722c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var, Boolean.FALSE);
                return;
            case 2:
                d9Var.f741z = false;
                return;
            default:
                d9Var.f727k.clear();
                d9Var.d(true);
                return;
        }
    }
}
