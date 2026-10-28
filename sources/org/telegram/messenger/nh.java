package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f20798a;
    public final Utilities.Callback2 f20799b;
    public final Exception f20800c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f20798a = i10;
        this.f20799b = callback2;
        this.f20800c = exc;
    }

    @Override
    public final void run() {
        switch (this.f20798a) {
            case 0:
                PasskeysController.lambda$create$3(this.f20799b, this.f20800c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f20799b, this.f20800c);
                return;
        }
    }
}
