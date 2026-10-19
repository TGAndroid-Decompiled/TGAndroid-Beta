package ci;

import org.telegram.messenger.NotificationCenter;
public final class x6 implements Runnable {
    public final int f6168a;
    public final a7 f6169b;

    public x6(a7 a7Var, int i10) {
        this.f6168a = i10;
        this.f6169b = a7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6168a;
        a7 a7Var = this.f6169b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(a7Var.f5146c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var);
                return;
            case 1:
                a7Var.f5161u = false;
                a7Var.f5162w = true;
                NotificationCenter.getInstance(a7Var.f5146c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var, Boolean.FALSE);
                return;
            case 2:
                a7Var.f5165z = false;
                return;
            default:
                a7Var.f5151k.clear();
                a7Var.d(true);
                return;
        }
    }
}
