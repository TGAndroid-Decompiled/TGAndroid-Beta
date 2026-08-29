package lh;

import org.telegram.messenger.NotificationCenter;
public final class h6 implements Runnable {
    public final int f15663a;
    public final k6 f15664b;

    public h6(k6 k6Var, int i10) {
        this.f15663a = i10;
        this.f15664b = k6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f15663a;
        k6 k6Var = this.f15664b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(k6Var.f15834c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, k6Var);
                return;
            case 1:
                k6Var.f15850u = false;
                k6Var.f15851w = true;
                NotificationCenter.getInstance(k6Var.f15834c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, k6Var, Boolean.FALSE);
                return;
            case 2:
                k6Var.f15854z = false;
                return;
            default:
                k6Var.f15840k.clear();
                k6Var.d(true);
                return;
        }
    }
}
