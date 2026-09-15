package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f16141a;
    public final NotificationsController f16142b;
    public final long f16143c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16141a = i11;
        this.f16142b = notificationsController;
        this.f16143c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16141a) {
            case 0:
                this.f16142b.lambda$processDeleteStory$15(this.f16143c, this.d);
                return;
            default:
                this.f16142b.lambda$processReadStories$16(this.f16143c, this.d);
                return;
        }
    }
}
