package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class kh implements Runnable {
    public final int f18805a;
    public final Utilities.Callback2 f18806b;
    public final Exception f18807c;

    public kh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18805a = i10;
        this.f18806b = callback2;
        this.f18807c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18805a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18806b, this.f18807c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18806b, this.f18807c);
                return;
        }
    }
}
