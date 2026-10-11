package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f17666a;
    public final NotificationsController f17667b;
    public final long f17668c;
    public final int d;

    public dh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17666a = i11;
        this.f17667b = notificationsController;
        this.f17668c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17666a) {
            case 0:
                this.f17667b.lambda$processDeleteStory$16(this.f17668c, this.d);
                return;
            default:
                this.f17667b.lambda$processReadStories$17(this.f17668c, this.d);
                return;
        }
    }
}
