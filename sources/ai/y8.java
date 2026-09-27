package ai;

import org.telegram.messenger.NotificationCenter;
public final class y8 implements Runnable {
    public final int f1761a;
    public final d9 f1762b;

    public y8(d9 d9Var, int i10) {
        this.f1761a = i10;
        this.f1762b = d9Var;
    }

    @Override
    public final void run() {
        int i10 = this.f1761a;
        d9 d9Var = this.f1762b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(d9Var.f725c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                return;
            case 1:
                d9Var.f740u = false;
                d9Var.f741w = true;
                NotificationCenter.getInstance(d9Var.f725c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var, Boolean.FALSE);
                return;
            case 2:
                d9Var.f744z = false;
                return;
            default:
                d9Var.f730k.clear();
                d9Var.d(true);
                return;
        }
    }
}
