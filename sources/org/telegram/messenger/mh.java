package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f16770a;
    public final Utilities.Callback2 f16771b;
    public final Exception f16772c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f16770a = i10;
        this.f16771b = callback2;
        this.f16772c = exc;
    }

    @Override
    public final void run() {
        switch (this.f16770a) {
            case 0:
                PasskeysController.lambda$create$3(this.f16771b, this.f16772c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f16771b, this.f16772c);
                return;
        }
    }
}
