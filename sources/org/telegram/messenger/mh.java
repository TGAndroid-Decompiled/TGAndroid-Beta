package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f17013a;
    public final Utilities.Callback2 f17014b;
    public final Exception f17015c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17013a = i10;
        this.f17014b = callback2;
        this.f17015c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17013a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17014b, this.f17015c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17014b, this.f17015c);
                return;
        }
    }
}
