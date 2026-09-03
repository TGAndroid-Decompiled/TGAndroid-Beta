package oh;

import org.telegram.messenger.NotificationCenter;
public final class i6 implements Runnable {
    public final int f17223a;
    public final l6 f17224b;

    public i6(l6 l6Var, int i10) {
        this.f17223a = i10;
        this.f17224b = l6Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17223a;
        l6 l6Var = this.f17224b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(l6Var.f17400c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var);
                return;
            case 1:
                l6Var.f17416u = false;
                l6Var.f17417w = true;
                NotificationCenter.getInstance(l6Var.f17400c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l6Var, Boolean.FALSE);
                return;
            case 2:
                l6Var.f17420z = false;
                return;
            default:
                l6Var.f17406k.clear();
                l6Var.d(true);
                return;
        }
    }
}
