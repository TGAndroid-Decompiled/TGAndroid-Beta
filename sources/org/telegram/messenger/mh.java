package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18437a;
    public final Utilities.Callback2 f18438b;
    public final Exception f18439c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18437a = i10;
        this.f18438b = callback2;
        this.f18439c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18437a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18438b, this.f18439c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18438b, this.f18439c);
                return;
        }
    }
}
