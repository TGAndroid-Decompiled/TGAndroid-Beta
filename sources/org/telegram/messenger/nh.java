package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f17046a;
    public final Utilities.Callback2 f17047b;
    public final Exception f17048c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17046a = i10;
        this.f17047b = callback2;
        this.f17048c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17046a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17047b, this.f17048c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17047b, this.f17048c);
                return;
        }
    }
}
