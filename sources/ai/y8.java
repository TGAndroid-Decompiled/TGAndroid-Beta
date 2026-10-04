package ai;

import org.telegram.messenger.NotificationCenter;
public final class y8 implements Runnable {
    public final int f1913a;
    public final d9 f1914b;

    public y8(d9 d9Var, int i10) {
        this.f1913a = i10;
        this.f1914b = d9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f1913a;
        d9 d9Var = this.f1914b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(d9Var.f785c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                return;
            case 1:
                d9Var.f801u = false;
                d9Var.f802w = true;
                NotificationCenter.getInstance(d9Var.f785c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var, Boolean.FALSE);
                return;
            case 2:
                d9Var.f805z = false;
                return;
            default:
                d9Var.f791k.clear();
                d9Var.d(true);
                return;
        }
    }
}
