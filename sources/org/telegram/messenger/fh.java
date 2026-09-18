package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f16319a;
    public final NotificationsController f16320b;
    public final long f16321c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16319a = i11;
        this.f16320b = notificationsController;
        this.f16321c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16319a) {
            case 0:
                this.f16320b.lambda$processDeleteStory$15(this.f16321c, this.d);
                return;
            default:
                this.f16320b.lambda$processReadStories$16(this.f16321c, this.d);
                return;
        }
    }
}
