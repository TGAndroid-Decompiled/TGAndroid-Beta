package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18581a;
    public final Utilities.Callback2 f18582b;
    public final Exception f18583c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18581a = i10;
        this.f18582b = callback2;
        this.f18583c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18581a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18582b, this.f18583c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18582b, this.f18583c);
                return;
        }
    }
}
