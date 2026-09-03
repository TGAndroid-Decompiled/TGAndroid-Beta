package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f17391a;
    public final NotificationsController f17392b;
    public final long f17393c;
    public final int d;

    public hh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f17391a = i11;
        this.f17392b = notificationsController;
        this.f17393c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17391a) {
            case 0:
                this.f17392b.lambda$processDeleteStory$15(this.f17393c, this.d);
                return;
            default:
                this.f17392b.lambda$processReadStories$16(this.f17393c, this.d);
                return;
        }
    }
}
