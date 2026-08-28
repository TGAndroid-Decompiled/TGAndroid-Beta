package org.telegram.messenger;
public final class xg implements Runnable {
    public final int f22153a;
    public final NotificationsController f22154b;
    public final long f22155c;
    public final int d;

    public xg(NotificationsController notificationsController, long j10, int i9, int i10) {
        this.f22153a = i10;
        this.f22154b = notificationsController;
        this.f22155c = j10;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f22153a) {
            case 0:
                this.f22154b.lambda$processDeleteStory$15(this.f22155c, this.d);
                return;
            default:
                this.f22154b.lambda$processReadStories$16(this.f22155c, this.d);
                return;
        }
    }
}
