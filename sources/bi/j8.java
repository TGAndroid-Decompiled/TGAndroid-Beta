package bi;

import org.telegram.messenger.NotificationCenter;
public final class j8 implements Runnable {
    public final int f3207a;
    public final o8 f3208b;

    public j8(o8 o8Var, int i10) {
        this.f3207a = i10;
        this.f3208b = o8Var;
    }

    @Override
    public final void run() {
        int i10 = this.f3207a;
        o8 o8Var = this.f3208b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(o8Var.f3426c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, o8Var);
                return;
            case 1:
                o8Var.f3441u = false;
                o8Var.f3442w = true;
                NotificationCenter.getInstance(o8Var.f3426c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, o8Var, Boolean.FALSE);
                return;
            case 2:
                o8Var.f3445z = false;
                return;
            default:
                o8Var.f3431k.clear();
                o8Var.d(true);
                return;
        }
    }
}
