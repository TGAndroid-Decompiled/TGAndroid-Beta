package org.telegram.messenger;
public final class dh implements Runnable {
    public final int f17702a;
    public final NotificationsController f17703b;
    public final long f17704c;
    public final int d;

    public dh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17702a = i11;
        this.f17703b = notificationsController;
        this.f17704c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17702a) {
            case 0:
                this.f17703b.lambda$processDeleteStory$16(this.f17704c, this.d);
                return;
            default:
                this.f17703b.lambda$processReadStories$17(this.f17704c, this.d);
                return;
        }
    }
}
