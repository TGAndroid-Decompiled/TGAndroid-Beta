package cf;

import org.telegram.messenger.NotificationCenter;

public final class b implements Runnable {

    public final int f2574a;

    public final d f2575b;

    public b(d dVar, int i10) {
        this.f2574a = i10;
        this.f2575b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f2574a) {
            case 0:
                this.f2575b.g(false);
                break;
            default:
                NotificationCenter.getInstance(this.f2575b.f2583c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                break;
        }
    }
}
