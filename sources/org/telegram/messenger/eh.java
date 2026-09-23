package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f16043a;
    public final NotificationsController f16044b;
    public final long f16045c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16043a = i11;
        this.f16044b = notificationsController;
        this.f16045c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16043a) {
            case 0:
                this.f16044b.lambda$processDeleteStory$15(this.f16045c, this.d);
                return;
            default:
                this.f16044b.lambda$processReadStories$16(this.f16045c, this.d);
                return;
        }
    }
}
