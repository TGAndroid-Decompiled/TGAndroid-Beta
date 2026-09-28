package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f17027a;
    public final Utilities.Callback2 f17028b;
    public final Exception f17029c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17027a = i10;
        this.f17028b = callback2;
        this.f17029c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17027a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17028b, this.f17029c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17028b, this.f17029c);
                return;
        }
    }
}
