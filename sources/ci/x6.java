package ci;

import org.telegram.messenger.NotificationCenter;
public final class x6 implements Runnable {
    public final int f6171a;
    public final a7 f6172b;

    public x6(a7 a7Var, int i10) {
        this.f6171a = i10;
        this.f6172b = a7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6171a;
        a7 a7Var = this.f6172b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(a7Var.f5149c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var);
                return;
            case 1:
                a7Var.f5164u = false;
                a7Var.f5165w = true;
                NotificationCenter.getInstance(a7Var.f5149c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var, Boolean.FALSE);
                return;
            case 2:
                a7Var.f5168z = false;
                return;
            default:
                a7Var.f5154k.clear();
                a7Var.d(true);
                return;
        }
    }
}
