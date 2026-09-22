package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f16135a;
    public final NotificationsController f16136b;
    public final long f16137c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16135a = i11;
        this.f16136b = notificationsController;
        this.f16137c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16135a) {
            case 0:
                this.f16136b.lambda$processDeleteStory$15(this.f16137c, this.d);
                return;
            default:
                this.f16136b.lambda$processReadStories$16(this.f16137c, this.d);
                return;
        }
    }
}
