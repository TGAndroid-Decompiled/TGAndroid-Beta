package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f16306a;
    public final NotificationsController f16307b;
    public final long f16308c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16306a = i11;
        this.f16307b = notificationsController;
        this.f16308c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16306a) {
            case 0:
                this.f16307b.lambda$processDeleteStory$15(this.f16308c, this.d);
                return;
            default:
                this.f16307b.lambda$processReadStories$16(this.f16308c, this.d);
                return;
        }
    }
}
