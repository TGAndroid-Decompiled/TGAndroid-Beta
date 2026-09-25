package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f17028a;
    public final Utilities.Callback2 f17029b;
    public final Exception f17030c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17028a = i10;
        this.f17029b = callback2;
        this.f17030c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17028a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17029b, this.f17030c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17029b, this.f17030c);
                return;
        }
    }
}
