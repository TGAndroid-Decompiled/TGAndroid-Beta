package org.telegram.messenger;

public final class jh implements Runnable {

    public final int f20689a;

    public final Utilities.Callback2 f20690b;

    public final Exception f20691c;

    public jh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f20689a = i10;
        this.f20690b = callback2;
        this.f20691c = exc;
    }

    @Override
    public final void run() {
        switch (this.f20689a) {
            case 0:
                PasskeysController.lambda$create$3(this.f20690b, this.f20691c);
                break;
            default:
                PasskeysController.lambda$create$8(this.f20690b, this.f20691c);
                break;
        }
    }
}
