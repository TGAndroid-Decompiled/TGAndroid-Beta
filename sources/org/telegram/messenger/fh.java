package org.telegram.messenger;
public final class fh implements Runnable {
    public final int f17695a;
    public final NotificationsController f17696b;
    public final long f17697c;
    public final int d;

    public fh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17695a = i11;
        this.f17696b = notificationsController;
        this.f17697c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17695a) {
            case 0:
                this.f17696b.lambda$processDeleteStory$15(this.f17697c, this.d);
                return;
            default:
                this.f17696b.lambda$processReadStories$16(this.f17697c, this.d);
                return;
        }
    }
}
