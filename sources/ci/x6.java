package ci;

import org.telegram.messenger.NotificationCenter;
public final class x6 implements Runnable {
    public final int f6170a;
    public final a7 f6171b;

    public x6(a7 a7Var, int i10) {
        this.f6170a = i10;
        this.f6171b = a7Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6170a;
        a7 a7Var = this.f6171b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(a7Var.f5148c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var);
                return;
            case 1:
                a7Var.f5163u = false;
                a7Var.f5164w = true;
                NotificationCenter.getInstance(a7Var.f5148c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a7Var, Boolean.FALSE);
                return;
            case 2:
                a7Var.f5167z = false;
                return;
            default:
                a7Var.f5153k.clear();
                a7Var.d(true);
                return;
        }
    }
}
