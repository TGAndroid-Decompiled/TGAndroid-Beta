package ai;

import org.telegram.messenger.NotificationCenter;
public final class y8 implements Runnable {
    public final int f1760a;
    public final d9 f1761b;

    public y8(d9 d9Var, int i10) {
        this.f1760a = i10;
        this.f1761b = d9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f1760a;
        d9 d9Var = this.f1761b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(d9Var.f713c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                return;
            case 1:
                d9Var.f728u = false;
                d9Var.f729w = true;
                NotificationCenter.getInstance(d9Var.f713c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var, Boolean.FALSE);
                return;
            case 2:
                d9Var.f732z = false;
                return;
            default:
                d9Var.f718k.clear();
                d9Var.d(true);
                return;
        }
    }
}
