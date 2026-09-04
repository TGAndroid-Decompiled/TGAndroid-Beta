package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f17668a;
    public final NotificationsController f17669b;
    public final long f17670c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17668a = i11;
        this.f17669b = notificationsController;
        this.f17670c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17668a) {
            case 0:
                this.f17669b.lambda$processDeleteStory$15(this.f17670c, this.d);
                return;
            default:
                this.f17669b.lambda$processReadStories$16(this.f17670c, this.d);
                return;
        }
    }
}
