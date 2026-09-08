package bi;

import org.telegram.messenger.NotificationCenter;
public final class g8 implements Runnable {
    public final int f3053a;
    public final l8 f3054b;

    public g8(l8 l8Var, int i10) {
        this.f3053a = i10;
        this.f3054b = l8Var;
    }

    @Override
    public final void run() {
        int i10 = this.f3053a;
        l8 l8Var = this.f3054b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l8Var.f3298c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l8Var);
                return;
            case 1:
                l8Var.f3314u = false;
                l8Var.f3315w = true;
                NotificationCenter.getInstance(l8Var.f3298c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l8Var, Boolean.FALSE);
                return;
            case 2:
                l8Var.f3318z = false;
                return;
            default:
                l8Var.f3304k.clear();
                l8Var.d(true);
                return;
        }
    }
}
