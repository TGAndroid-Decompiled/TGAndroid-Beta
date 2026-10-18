package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class hh implements Runnable {
    public final int f18536a;
    public final Utilities.Callback2 f18537b;
    public final Exception f18538c;

    public hh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18536a = i10;
        this.f18537b = callback2;
        this.f18538c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18536a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18537b, this.f18538c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18537b, this.f18538c);
                return;
        }
    }
}
