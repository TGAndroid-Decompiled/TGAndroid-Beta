package gf;

import org.telegram.messenger.NotificationCenter;
public final class b implements Runnable {
    public final int f7028a;
    public final e f7029b;

    public b(e eVar, int i10) {
        this.f7028a = i10;
        this.f7029b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f7028a) {
            case 0:
                this.f7029b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f7029b.f7040c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
