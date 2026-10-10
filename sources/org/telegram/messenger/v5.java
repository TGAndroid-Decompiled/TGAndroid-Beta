package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19396a;
    public final LocationSharingService f19397b;

    public v5(LocationSharingService locationSharingService, int i10) {
        this.f19396a = i10;
        this.f19397b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19396a) {
            case 0:
                LocationSharingService.a(this.f19397b);
                return;
            default:
                LocationSharingService.b(this.f19397b);
                return;
        }
    }
}
