package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f20976a;
    public final Utilities.Callback2 f20977b;
    public final Exception f20978c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f20976a = i10;
        this.f20977b = callback2;
        this.f20978c = exc;
    }

    @Override
    public final void run() {
        switch (this.f20976a) {
            case 0:
                PasskeysController.lambda$create$3(this.f20977b, this.f20978c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f20977b, this.f20978c);
                return;
        }
    }
}
