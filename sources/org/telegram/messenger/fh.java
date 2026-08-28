package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class fh implements Runnable {
    public final int f20301a;
    public final Utilities.Callback2 f20302b;
    public final Exception f20303c;

    public fh(Utilities.Callback2 callback2, Exception exc, int i9) {
        this.f20301a = i9;
        this.f20302b = callback2;
        this.f20303c = exc;
    }

    @Override
    public final void run() {
        switch (this.f20301a) {
            case 0:
                PasskeysController.lambda$create$3(this.f20302b, this.f20303c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f20302b, this.f20303c);
                return;
        }
    }
}
