package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f18879a;
    public final NotificationsController f18880b;
    public final long f18881c;
    public final int d;

    public hh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f18879a = i11;
        this.f18880b = notificationsController;
        this.f18881c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18879a) {
            case 0:
                this.f18880b.lambda$processDeleteStory$15(this.f18881c, this.d);
                return;
            default:
                this.f18880b.lambda$processReadStories$16(this.f18881c, this.d);
                return;
        }
    }
}
