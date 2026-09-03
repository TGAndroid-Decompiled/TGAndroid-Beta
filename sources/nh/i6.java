package nh;

import org.telegram.messenger.NotificationCenter;
public final class i6 implements Runnable {
    public final int f15398a;
    public final l6 f15399b;

    public i6(l6 l6Var, int i10) {
        this.f15398a = i10;
        this.f15399b = l6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f15398a;
        l6 l6Var = this.f15399b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l6Var.f15557c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var);
                return;
            case 1:
                l6Var.f15572u = false;
                l6Var.f15573w = true;
                NotificationCenter.getInstance(l6Var.f15557c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var, Boolean.FALSE);
                return;
            case 2:
                l6Var.f15576z = false;
                return;
            default:
                l6Var.f15562k.clear();
                l6Var.d(true);
                return;
        }
    }
}
