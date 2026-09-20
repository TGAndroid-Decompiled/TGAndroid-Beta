package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f16359a;
    public final NotificationsController f16360b;
    public final long f16361c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16359a = i11;
        this.f16360b = notificationsController;
        this.f16361c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16359a) {
            case 0:
                this.f16360b.lambda$processDeleteStory$15(this.f16361c, this.d);
                return;
            default:
                this.f16360b.lambda$processReadStories$16(this.f16361c, this.d);
                return;
        }
    }
}
