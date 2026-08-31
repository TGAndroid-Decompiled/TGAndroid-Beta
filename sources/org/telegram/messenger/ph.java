package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ph implements Runnable {
    public final int f19701a;
    public final Utilities.Callback2 f19702b;
    public final Exception f19703c;

    public ph(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f19701a = i10;
        this.f19702b = callback2;
        this.f19703c = exc;
    }

    @Override
    public final void run() {
        switch (this.f19701a) {
            case 0:
                PasskeysController.lambda$create$3(this.f19702b, this.f19703c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f19702b, this.f19703c);
                return;
        }
    }
}
