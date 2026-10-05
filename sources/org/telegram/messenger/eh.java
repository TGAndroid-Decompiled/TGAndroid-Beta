package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17780a;
    public final NotificationsController f17781b;
    public final long f17782c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17780a = i11;
        this.f17781b = notificationsController;
        this.f17782c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17780a) {
            case 0:
                this.f17781b.lambda$processDeleteStory$15(this.f17782c, this.d);
                return;
            default:
                this.f17781b.lambda$processReadStories$16(this.f17782c, this.d);
                return;
        }
    }
}
