package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17774a;
    public final NotificationsController f17775b;
    public final long f17776c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17774a = i11;
        this.f17775b = notificationsController;
        this.f17776c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17774a) {
            case 0:
                this.f17775b.lambda$processDeleteStory$15(this.f17776c, this.d);
                return;
            default:
                this.f17775b.lambda$processReadStories$16(this.f17776c, this.d);
                return;
        }
    }
}
