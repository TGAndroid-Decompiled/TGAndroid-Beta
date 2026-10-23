package ci;

import org.telegram.messenger.NotificationCenter;
public final class w6 implements Runnable {
    public final int f6063a;
    public final z6 f6064b;

    public w6(z6 z6Var, int i10) {
        this.f6063a = i10;
        this.f6064b = z6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f6063a;
        z6 z6Var = this.f6064b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(z6Var.f6190c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var);
                return;
            case 1:
                z6Var.f6205u = false;
                z6Var.f6206w = true;
                NotificationCenter.getInstance(z6Var.f6190c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, z6Var, Boolean.FALSE);
                return;
            case 2:
                z6Var.f6209z = false;
                return;
            default:
                z6Var.f6195k.clear();
                z6Var.d(true);
                return;
        }
    }
}
