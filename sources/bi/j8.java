package bi;

import org.telegram.messenger.NotificationCenter;
public final class j8 implements Runnable {
    public final int f3211a;
    public final o8 f3212b;

    public j8(o8 o8Var, int i10) {
        this.f3211a = i10;
        this.f3212b = o8Var;
    }

    @Override
    public final void run() {
        int i10 = this.f3211a;
        o8 o8Var = this.f3212b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(o8Var.f3430c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, o8Var);
                return;
            case 1:
                o8Var.f3445u = false;
                o8Var.f3446w = true;
                NotificationCenter.getInstance(o8Var.f3430c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, o8Var, Boolean.FALSE);
                return;
            case 2:
                o8Var.f3449z = false;
                return;
            default:
                o8Var.f3435k.clear();
                o8Var.d(true);
                return;
        }
    }
}
