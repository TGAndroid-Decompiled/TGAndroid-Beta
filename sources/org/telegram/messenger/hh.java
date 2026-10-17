package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class hh implements Runnable {
    public final int f18537a;
    public final Utilities.Callback2 f18538b;
    public final Exception f18539c;

    public hh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18537a = i10;
        this.f18538b = callback2;
        this.f18539c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18537a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18538b, this.f18539c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18538b, this.f18539c);
                return;
        }
    }
}
