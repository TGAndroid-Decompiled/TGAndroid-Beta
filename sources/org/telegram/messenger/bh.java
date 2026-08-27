package org.telegram.messenger;

public final class bh implements Runnable {

    public final int f19830a;

    public final NotificationsController f19831b;

    public final long f19832c;
    public final int d;

    public bh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f19830a = i11;
        this.f19831b = notificationsController;
        this.f19832c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19830a) {
            case 0:
                this.f19831b.lambda$processDeleteStory$15(this.f19832c, this.d);
                break;
            default:
                this.f19831b.lambda$processReadStories$16(this.f19832c, this.d);
                break;
        }
    }
}
