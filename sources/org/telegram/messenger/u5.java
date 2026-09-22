package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17431a;
    public final LocationSharingService f17432b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17431a = i10;
        this.f17432b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17431a) {
            case 0:
                LocationSharingService.a(this.f17432b);
                return;
            default:
                LocationSharingService.b(this.f17432b);
                return;
        }
    }
}
