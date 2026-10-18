package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ih implements Runnable {
    public final int f18607a;
    public final Utilities.Callback2 f18608b;
    public final Exception f18609c;

    public ih(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18607a = i10;
        this.f18608b = callback2;
        this.f18609c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18607a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18608b, this.f18609c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18608b, this.f18609c);
                return;
        }
    }
}
