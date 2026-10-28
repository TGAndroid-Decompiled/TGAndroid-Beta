package di;

import org.telegram.messenger.NotificationCenter;
public final class w6 implements Runnable {
    public final int f9309a;
    public final z6 f9310b;

    public w6(z6 z6Var, int i10) {
        this.f9309a = i10;
        this.f9310b = z6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f9309a;
        z6 z6Var = this.f9310b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(z6Var.f9489c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var);
                return;
            case 1:
                z6Var.f9504u = false;
                z6Var.f9505w = true;
                NotificationCenter.getInstance(z6Var.f9489c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var, Boolean.FALSE);
                return;
            case 2:
                z6Var.f9508z = false;
                return;
            default:
                z6Var.f9494k.clear();
                z6Var.d(true);
                return;
        }
    }
}
