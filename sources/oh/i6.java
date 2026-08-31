package oh;

import org.telegram.messenger.NotificationCenter;
public final class i6 implements Runnable {
    public final int f17221a;
    public final l6 f17222b;

    public i6(l6 l6Var, int i10) {
        this.f17221a = i10;
        this.f17222b = l6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17221a;
        l6 l6Var = this.f17222b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l6Var.f17398c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var);
                return;
            case 1:
                l6Var.f17414u = false;
                l6Var.f17415w = true;
                NotificationCenter.getInstance(l6Var.f17398c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var, Boolean.FALSE);
                return;
            case 2:
                l6Var.f17418z = false;
                return;
            default:
                l6Var.f17404k.clear();
                l6Var.d(true);
                return;
        }
    }
}
