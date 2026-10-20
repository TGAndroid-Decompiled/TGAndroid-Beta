package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class jh implements Runnable {
    public final int f18702a;
    public final Utilities.Callback2 f18703b;
    public final Exception f18704c;

    public jh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18702a = i10;
        this.f18703b = callback2;
        this.f18704c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18702a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18703b, this.f18704c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18703b, this.f18704c);
                return;
        }
    }
}
