package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18589a;
    public final Utilities.Callback2 f18590b;
    public final Exception f18591c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18589a = i10;
        this.f18590b = callback2;
        this.f18591c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18589a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18590b, this.f18591c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18590b, this.f18591c);
                return;
        }
    }
}
