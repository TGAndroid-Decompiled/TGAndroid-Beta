package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f18877a;
    public final NotificationsController f18878b;
    public final long f18879c;
    public final int d;

    public hh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f18877a = i11;
        this.f18878b = notificationsController;
        this.f18879c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18877a) {
            case 0:
                this.f18878b.lambda$processDeleteStory$15(this.f18879c, this.d);
                return;
            default:
                this.f18878b.lambda$processReadStories$16(this.f18879c, this.d);
                return;
        }
    }
}
