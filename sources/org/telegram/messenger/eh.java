package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17773a;
    public final NotificationsController f17774b;
    public final long f17775c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17773a = i11;
        this.f17774b = notificationsController;
        this.f17775c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17773a) {
            case 0:
                this.f17774b.lambda$processDeleteStory$16(this.f17775c, this.d);
                return;
            default:
                this.f17774b.lambda$processReadStories$17(this.f17775c, this.d);
                return;
        }
    }
}
