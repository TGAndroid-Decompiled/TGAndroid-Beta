package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class lh implements Runnable {
    public final int f18959a;
    public final Utilities.Callback2 f18960b;
    public final Exception f18961c;

    public lh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18959a = i10;
        this.f18960b = callback2;
        this.f18961c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18959a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18960b, this.f18961c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18960b, this.f18961c);
                return;
        }
    }
}
