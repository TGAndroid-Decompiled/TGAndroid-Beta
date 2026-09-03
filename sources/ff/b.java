package ff;

import org.telegram.messenger.NotificationCenter;
public final class b implements Runnable {
    public final int f6100a;
    public final e f6101b;

    public b(e eVar, int i10) {
        this.f6100a = i10;
        this.f6101b = eVar;
    }

    @Override
    public final void run() {
        switch (this.f6100a) {
            case 0:
                this.f6101b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f6101b.f6112c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
