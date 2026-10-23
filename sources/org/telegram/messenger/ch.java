package org.telegram.messenger;
public final class ch implements Runnable {
    public final int f18174a;
    public final NotificationsController f18175b;
    public final long f18176c;
    public final int d;

    public ch(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f18174a = i11;
        this.f18175b = notificationsController;
        this.f18176c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18174a) {
            case 0:
                this.f18175b.lambda$processDeleteStory$16(this.f18176c, this.d);
                return;
            default:
                this.f18175b.lambda$processReadStories$17(this.f18176c, this.d);
                return;
        }
    }
}
