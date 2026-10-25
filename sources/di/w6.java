package di;

import org.telegram.messenger.NotificationCenter;
public final class w6 implements Runnable {
    public final int f9310a;
    public final z6 f9311b;

    public w6(z6 z6Var, int i10) {
        this.f9310a = i10;
        this.f9311b = z6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f9310a;
        z6 z6Var = this.f9311b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(z6Var.f9490c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var);
                return;
            case 1:
                z6Var.f9505u = false;
                z6Var.f9506w = true;
                NotificationCenter.getInstance(z6Var.f9490c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var, Boolean.FALSE);
                return;
            case 2:
                z6Var.f9509z = false;
                return;
            default:
                z6Var.f9495k.clear();
                z6Var.d(true);
                return;
        }
    }
}
