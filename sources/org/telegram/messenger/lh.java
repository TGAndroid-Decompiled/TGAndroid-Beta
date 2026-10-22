package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class lh implements Runnable {
    public final int f18891a;
    public final Utilities.Callback2 f18892b;
    public final Exception f18893c;

    public lh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18891a = i10;
        this.f18892b = callback2;
        this.f18893c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18891a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18892b, this.f18893c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18892b, this.f18893c);
                return;
        }
    }
}
