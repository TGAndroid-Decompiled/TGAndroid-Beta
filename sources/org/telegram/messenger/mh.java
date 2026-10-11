package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18545a;
    public final Utilities.Callback2 f18546b;
    public final Exception f18547c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18545a = i10;
        this.f18546b = callback2;
        this.f18547c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18545a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18546b, this.f18547c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18546b, this.f18547c);
                return;
        }
    }
}
