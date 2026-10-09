package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18543a;
    public final Utilities.Callback2 f18544b;
    public final Exception f18545c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18543a = i10;
        this.f18544b = callback2;
        this.f18545c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18543a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18544b, this.f18545c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18544b, this.f18545c);
                return;
        }
    }
}
