package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18591a;
    public final Utilities.Callback2 f18592b;
    public final Exception f18593c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18591a = i10;
        this.f18592b = callback2;
        this.f18593c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18591a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18592b, this.f18593c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18592b, this.f18593c);
                return;
        }
    }
}
