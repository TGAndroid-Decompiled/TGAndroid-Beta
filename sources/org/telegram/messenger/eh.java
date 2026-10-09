package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17769a;
    public final NotificationsController f17770b;
    public final long f17771c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17769a = i11;
        this.f17770b = notificationsController;
        this.f17771c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17769a) {
            case 0:
                this.f17770b.lambda$processDeleteStory$16(this.f17771c, this.d);
                return;
            default:
                this.f17770b.lambda$processReadStories$17(this.f17771c, this.d);
                return;
        }
    }
}
