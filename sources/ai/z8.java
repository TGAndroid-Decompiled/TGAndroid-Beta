package ai;

import org.telegram.messenger.NotificationCenter;
public final class z8 implements Runnable {
    public final int f2017a;
    public final e9 f2018b;

    public z8(e9 e9Var, int i10) {
        this.f2017a = i10;
        this.f2018b = e9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f2017a;
        e9 e9Var = this.f2018b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(e9Var.f893c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, e9Var);
                return;
            case 1:
                e9Var.f909u = false;
                e9Var.f910w = true;
                NotificationCenter.getInstance(e9Var.f893c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, e9Var, Boolean.FALSE);
                return;
            case 2:
                e9Var.f913z = false;
                return;
            default:
                e9Var.f899k.clear();
                e9Var.d(true);
                return;
        }
    }
}
