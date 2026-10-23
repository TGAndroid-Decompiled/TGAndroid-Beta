package org.telegram.messenger;
public final class ch implements Runnable {
    public final int f18111a;
    public final NotificationsController f18112b;
    public final long f18113c;
    public final int d;

    public ch(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f18111a = i11;
        this.f18112b = notificationsController;
        this.f18113c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18111a) {
            case 0:
                this.f18112b.lambda$processDeleteStory$16(this.f18113c, this.d);
                return;
            default:
                this.f18112b.lambda$processReadStories$17(this.f18113c, this.d);
                return;
        }
    }
}
