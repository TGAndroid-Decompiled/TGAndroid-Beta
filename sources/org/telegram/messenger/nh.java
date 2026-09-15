package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f16864a;
    public final Utilities.Callback2 f16865b;
    public final Exception f16866c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f16864a = i10;
        this.f16865b = callback2;
        this.f16866c = exc;
    }

    @Override
    public final void run() {
        switch (this.f16864a) {
            case 0:
                PasskeysController.lambda$create$3(this.f16865b, this.f16866c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f16865b, this.f16866c);
                return;
        }
    }
}
