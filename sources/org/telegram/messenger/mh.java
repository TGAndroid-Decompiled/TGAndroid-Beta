package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18590a;
    public final Utilities.Callback2 f18591b;
    public final Exception f18592c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18590a = i10;
        this.f18591b = callback2;
        this.f18592c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18590a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18591b, this.f18592c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18591b, this.f18592c);
                return;
        }
    }
}
