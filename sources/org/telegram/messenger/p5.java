package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f21204a;
    public final LocationController f21205b;

    public p5(LocationController locationController, int i9) {
        this.f21204a = i9;
        this.f21205b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f21204a) {
            case 0:
                this.f21205b.lambda$onConnected$3();
                return;
            case 1:
                this.f21205b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f21205b.lambda$new$0();
                return;
            case 3:
                this.f21205b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f21205b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f21205b.lambda$cleanup$9();
                return;
            default:
                this.f21205b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
