package org.telegram.messenger;
public final class gh implements Runnable {
    public final int f17335a;
    public final NotificationsController f17336b;
    public final long f17337c;
    public final int d;

    public gh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f17335a = i11;
        this.f17336b = notificationsController;
        this.f17337c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17335a) {
            case 0:
                this.f17336b.lambda$processDeleteStory$16(this.f17337c, this.d);
                return;
            default:
                this.f17336b.lambda$processReadStories$17(this.f17337c, this.d);
                return;
        }
    }
}
