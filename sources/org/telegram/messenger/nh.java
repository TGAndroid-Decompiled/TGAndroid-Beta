package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f16860a;
    public final Utilities.Callback2 f16861b;
    public final Exception f16862c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f16860a = i10;
        this.f16861b = callback2;
        this.f16862c = exc;
    }

    @Override
    public final void run() {
        switch (this.f16860a) {
            case 0:
                PasskeysController.lambda$create$3(this.f16861b, this.f16862c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f16861b, this.f16862c);
                return;
        }
    }
}
