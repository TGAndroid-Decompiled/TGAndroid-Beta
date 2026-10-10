package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18547a;
    public final Utilities.Callback2 f18548b;
    public final Exception f18549c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18547a = i10;
        this.f18548b = callback2;
        this.f18549c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18547a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18548b, this.f18549c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18548b, this.f18549c);
                return;
        }
    }
}
