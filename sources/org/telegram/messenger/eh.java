package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f16291a;
    public final NotificationsController f16292b;
    public final long f16293c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16291a = i11;
        this.f16292b = notificationsController;
        this.f16293c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16291a) {
            case 0:
                this.f16292b.lambda$processDeleteStory$15(this.f16293c, this.d);
                return;
            default:
                this.f16292b.lambda$processReadStories$16(this.f16293c, this.d);
                return;
        }
    }
}
