package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f16305a;
    public final NotificationsController f16306b;
    public final long f16307c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16305a = i11;
        this.f16306b = notificationsController;
        this.f16307c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16305a) {
            case 0:
                this.f16306b.lambda$processDeleteStory$15(this.f16307c, this.d);
                return;
            default:
                this.f16306b.lambda$processReadStories$16(this.f16307c, this.d);
                return;
        }
    }
}
