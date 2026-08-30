package gf;

import org.telegram.messenger.NotificationCenter;
public final class b implements Runnable {
    public final int f6531a;
    public final e f6532b;

    public b(e eVar, int i10) {
        this.f6531a = i10;
        this.f6532b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f6531a) {
            case 0:
                this.f6532b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f6532b.f6543c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
