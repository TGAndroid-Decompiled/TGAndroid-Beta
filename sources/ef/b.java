package ef;

import org.telegram.messenger.NotificationCenter;
public final class b implements Runnable {
    public final int f5888a;
    public final e f5889b;

    public b(e eVar, int i10) {
        this.f5888a = i10;
        this.f5889b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f5888a) {
            case 0:
                this.f5889b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f5889b.f5900c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
