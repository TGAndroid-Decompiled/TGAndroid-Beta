package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f16297a;
    public final NotificationsController f16298b;
    public final long f16299c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16297a = i11;
        this.f16298b = notificationsController;
        this.f16299c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16297a) {
            case 0:
                this.f16298b.lambda$processDeleteStory$15(this.f16299c, this.d);
                return;
            default:
                this.f16298b.lambda$processReadStories$16(this.f16299c, this.d);
                return;
        }
    }
}
