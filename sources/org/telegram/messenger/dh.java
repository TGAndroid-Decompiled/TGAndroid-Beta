package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f18191a;
    public final NotificationsController f18192b;
    public final long f18193c;
    public final int d;

    public dh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f18191a = i11;
        this.f18192b = notificationsController;
        this.f18193c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18191a) {
            case 0:
                this.f18192b.lambda$processDeleteStory$16(this.f18193c, this.d);
                return;
            default:
                this.f18192b.lambda$processReadStories$17(this.f18193c, this.d);
                return;
        }
    }
}
