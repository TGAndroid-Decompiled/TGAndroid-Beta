package ci;

import org.telegram.messenger.NotificationCenter;
public final class w6 implements Runnable {
    public final int f6056a;
    public final z6 f6057b;

    public w6(z6 z6Var, int i10) {
        this.f6056a = i10;
        this.f6057b = z6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6056a;
        z6 z6Var = this.f6057b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(z6Var.f6181c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var);
                return;
            case 1:
                z6Var.f6196u = false;
                z6Var.f6197w = true;
                NotificationCenter.getInstance(z6Var.f6181c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var, Boolean.FALSE);
                return;
            case 2:
                z6Var.f6200z = false;
                return;
            default:
                z6Var.f6186k.clear();
                z6Var.d(true);
                return;
        }
    }
}
