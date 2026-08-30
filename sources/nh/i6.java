package nh;

import org.telegram.messenger.NotificationCenter;
public final class i6 implements Runnable {
    public final int f15418a;
    public final l6 f15419b;

    public i6(l6 l6Var, int i10) {
        this.f15418a = i10;
        this.f15419b = l6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f15418a;
        l6 l6Var = this.f15419b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l6Var.f15577c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var);
                return;
            case 1:
                l6Var.f15592u = false;
                l6Var.f15593w = true;
                NotificationCenter.getInstance(l6Var.f15577c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var, Boolean.FALSE);
                return;
            case 2:
                l6Var.f15596z = false;
                return;
            default:
                l6Var.f15582k.clear();
                l6Var.d(true);
                return;
        }
    }
}
