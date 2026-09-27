package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f17022a;
    public final Utilities.Callback2 f17023b;
    public final Exception f17024c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17022a = i10;
        this.f17023b = callback2;
        this.f17024c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17022a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17023b, this.f17024c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17023b, this.f17024c);
                return;
        }
    }
}
