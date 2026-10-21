package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class jh implements Runnable {
    public final int f18700a;
    public final Utilities.Callback2 f18701b;
    public final Exception f18702c;

    public jh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18700a = i10;
        this.f18701b = callback2;
        this.f18702c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18700a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18701b, this.f18702c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18701b, this.f18702c);
                return;
        }
    }
}
