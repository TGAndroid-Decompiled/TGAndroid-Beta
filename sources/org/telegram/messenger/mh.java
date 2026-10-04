package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18586a;
    public final Utilities.Callback2 f18587b;
    public final Exception f18588c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18586a = i10;
        this.f18587b = callback2;
        this.f18588c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18586a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18587b, this.f18588c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18587b, this.f18588c);
                return;
        }
    }
}
