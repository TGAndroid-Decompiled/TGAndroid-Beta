package ai;

import org.telegram.messenger.NotificationCenter;
public final class z8 implements Runnable {
    public final int f2019a;
    public final e9 f2020b;

    public z8(e9 e9Var, int i10) {
        this.f2019a = i10;
        this.f2020b = e9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f2019a;
        e9 e9Var = this.f2020b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(e9Var.f895c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, e9Var);
                return;
            case 1:
                e9Var.f911u = false;
                e9Var.f912w = true;
                NotificationCenter.getInstance(e9Var.f895c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, e9Var, Boolean.FALSE);
                return;
            case 2:
                e9Var.f915z = false;
                return;
            default:
                e9Var.f901k.clear();
                e9Var.d(true);
                return;
        }
    }
}
