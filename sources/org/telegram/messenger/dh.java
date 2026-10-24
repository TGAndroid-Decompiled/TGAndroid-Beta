package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f18254a;
    public final NotificationsController f18255b;
    public final long f18256c;
    public final int d;

    public dh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f18254a = i11;
        this.f18255b = notificationsController;
        this.f18256c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18254a) {
            case 0:
                this.f18255b.lambda$processDeleteStory$16(this.f18256c, this.d);
                return;
            default:
                this.f18255b.lambda$processReadStories$17(this.f18256c, this.d);
                return;
        }
    }
}
