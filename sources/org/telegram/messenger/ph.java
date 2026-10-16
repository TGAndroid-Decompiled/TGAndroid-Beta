package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ph implements Runnable {
    public final int f17820a;
    public final Utilities.Callback2 f17821b;
    public final Exception f17822c;

    public ph(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17820a = i10;
        this.f17821b = callback2;
        this.f17822c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17820a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17821b, this.f17822c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17821b, this.f17822c);
                return;
        }
    }
}
