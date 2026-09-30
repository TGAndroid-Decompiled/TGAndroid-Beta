package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f16322a;
    public final NotificationsController f16323b;
    public final long f16324c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16322a = i11;
        this.f16323b = notificationsController;
        this.f16324c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16322a) {
            case 0:
                this.f16323b.lambda$processDeleteStory$15(this.f16324c, this.d);
                return;
            default:
                this.f16323b.lambda$processReadStories$16(this.f16324c, this.d);
                return;
        }
    }
}
