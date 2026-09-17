package bi;

import org.telegram.messenger.NotificationCenter;
public final class g8 implements Runnable {
    public final int f3026a;
    public final l8 f3027b;

    public g8(l8 l8Var, int i10) {
        this.f3026a = i10;
        this.f3027b = l8Var;
    }

    @Override
    public final void run() {
        int i10 = this.f3026a;
        l8 l8Var = this.f3027b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l8Var.f3271c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l8Var);
                return;
            case 1:
                l8Var.f3287u = false;
                l8Var.f3288w = true;
                NotificationCenter.getInstance(l8Var.f3271c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l8Var, Boolean.FALSE);
                return;
            case 2:
                l8Var.f3291z = false;
                return;
            default:
                l8Var.f3277k.clear();
                l8Var.d(true);
                return;
        }
    }
}
