package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f21801a;
    public final LocationController f21802b;

    public x5(LocationController locationController, int i10) {
        this.f21801a = i10;
        this.f21802b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f21801a) {
            case 0:
                this.f21802b.lambda$onConnected$3();
                return;
            case 1:
                this.f21802b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f21802b.lambda$new$0();
                return;
            case 3:
                this.f21802b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f21802b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f21802b.lambda$cleanup$9();
                return;
            default:
                this.f21802b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
