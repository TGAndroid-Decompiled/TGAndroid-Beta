package org.telegram.messenger;
public final class nh implements Runnable {
    public final int f15893a;
    public final NotificationsController f15894b;
    public final long f15895c;
    public final int d;

    public nh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f15893a = i11;
        this.f15894b = notificationsController;
        this.f15895c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f15893a) {
            case 0:
                this.f15894b.lambda$processDeleteStory$15(this.f15895c, this.d);
                return;
            default:
                this.f15894b.lambda$processReadStories$16(this.f15895c, this.d);
                return;
        }
    }
}
