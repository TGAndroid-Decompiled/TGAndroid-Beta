package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f20101a;
    public final NotificationsController f20102b;
    public final long f20103c;
    public final int d;

    public fh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20101a = i11;
        this.f20102b = notificationsController;
        this.f20103c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20101a) {
            case 0:
                this.f20102b.lambda$processDeleteStory$16(this.f20103c, this.d);
                return;
            default:
                this.f20102b.lambda$processReadStories$17(this.f20103c, this.d);
                return;
        }
    }
}
