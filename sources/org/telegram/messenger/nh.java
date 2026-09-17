package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f16873a;
    public final Utilities.Callback2 f16874b;
    public final Exception f16875c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f16873a = i10;
        this.f16874b = callback2;
        this.f16875c = exc;
    }

    @Override
    public final void run() {
        switch (this.f16873a) {
            case 0:
                PasskeysController.lambda$create$3(this.f16874b, this.f16875c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f16874b, this.f16875c);
                return;
        }
    }
}
