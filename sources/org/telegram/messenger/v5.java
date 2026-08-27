package org.telegram.messenger;

public final class v5 implements Runnable {

    public final int f21771a;

    public final LocationSharingService f21772b;

    public v5(LocationSharingService locationSharingService, int i10) {
        this.f21771a = i10;
        this.f21772b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f21771a) {
            case 0:
                this.f21772b.lambda$onCreate$1();
                break;
            default:
                this.f21772b.lambda$didReceivedNotification$2();
                break;
        }
    }
}
