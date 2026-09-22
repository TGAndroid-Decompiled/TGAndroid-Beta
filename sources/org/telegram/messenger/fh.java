package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f16374a;
    public final NotificationsController f16375b;
    public final long f16376c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16374a = i11;
        this.f16375b = notificationsController;
        this.f16376c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16374a) {
            case 0:
                this.f16375b.lambda$processDeleteStory$15(this.f16376c, this.d);
                return;
            default:
                this.f16375b.lambda$processReadStories$16(this.f16376c, this.d);
                return;
        }
    }
}
