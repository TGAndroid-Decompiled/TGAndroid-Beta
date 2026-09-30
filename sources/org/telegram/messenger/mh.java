package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f17044a;
    public final Utilities.Callback2 f17045b;
    public final Exception f17046c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17044a = i10;
        this.f17045b = callback2;
        this.f17046c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17044a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17045b, this.f17046c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17045b, this.f17046c);
                return;
        }
    }
}
