package ai;

import org.telegram.messenger.NotificationCenter;
public final class y8 implements Runnable {
    public final int f1762a;
    public final d9 f1763b;

    public y8(d9 d9Var, int i10) {
        this.f1762a = i10;
        this.f1763b = d9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f1762a;
        d9 d9Var = this.f1763b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(d9Var.f715c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                return;
            case 1:
                d9Var.f730u = false;
                d9Var.f731w = true;
                NotificationCenter.getInstance(d9Var.f715c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var, Boolean.FALSE);
                return;
            case 2:
                d9Var.f734z = false;
                return;
            default:
                d9Var.f720k.clear();
                d9Var.d(true);
                return;
        }
    }
}
