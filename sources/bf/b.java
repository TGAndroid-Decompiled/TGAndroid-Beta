package bf;

import org.telegram.messenger.NotificationCenter;
public final class b implements Runnable {
    public final int f1670a;
    public final d f1671b;

    public b(d dVar, int i9) {
        this.f1670a = i9;
        this.f1671b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f1670a) {
            case 0:
                this.f1671b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f1671b.f1679c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
