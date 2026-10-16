package org.telegram.messenger;
public final class gh implements Runnable {
    public final int f17031a;
    public final NotificationsController f17032b;
    public final long f17033c;
    public final int d;

    public gh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f17031a = i11;
        this.f17032b = notificationsController;
        this.f17033c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17031a) {
            case 0:
                this.f17032b.lambda$processDeleteStory$16(this.f17033c, this.d);
                return;
            default:
                this.f17032b.lambda$processReadStories$17(this.f17033c, this.d);
                return;
        }
    }
}
