package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17609a;
    public final NotificationsController f17610b;
    public final long f17611c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17609a = i11;
        this.f17610b = notificationsController;
        this.f17611c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17609a) {
            case 0:
                this.f17610b.lambda$processDeleteStory$15(this.f17611c, this.d);
                return;
            default:
                this.f17610b.lambda$processReadStories$16(this.f17611c, this.d);
                return;
        }
    }
}
