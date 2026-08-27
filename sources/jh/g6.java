package jh;

import org.telegram.messenger.NotificationCenter;

public final class g6 implements Runnable {

    public final int f13366a;

    public final j6 f13367b;

    public g6(j6 j6Var, int i10) {
        this.f13366a = i10;
        this.f13367b = j6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f13366a;
        j6 j6Var = this.f13367b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(j6Var.f13536c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, j6Var);
                break;
            case 1:
                j6Var.f13552u = false;
                j6Var.f13553w = true;
                NotificationCenter.getInstance(j6Var.f13536c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, j6Var, Boolean.FALSE);
                break;
            case 2:
                j6Var.f13556z = false;
                break;
            default:
                j6Var.f13542k.clear();
                j6Var.d(true);
                break;
        }
    }
}
