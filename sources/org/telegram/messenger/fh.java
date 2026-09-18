package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f16150a;
    public final NotificationsController f16151b;
    public final long f16152c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16150a = i11;
        this.f16151b = notificationsController;
        this.f16152c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16150a) {
            case 0:
                this.f16151b.lambda$processDeleteStory$15(this.f16152c, this.d);
                return;
            default:
                this.f16151b.lambda$processReadStories$16(this.f16152c, this.d);
                return;
        }
    }
}
