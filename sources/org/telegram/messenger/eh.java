package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17582a;
    public final NotificationsController f17583b;
    public final long f17584c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17582a = i11;
        this.f17583b = notificationsController;
        this.f17584c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17582a) {
            case 0:
                this.f17583b.lambda$processDeleteStory$15(this.f17584c, this.d);
                return;
            default:
                this.f17583b.lambda$processReadStories$16(this.f17584c, this.d);
                return;
        }
    }
}
