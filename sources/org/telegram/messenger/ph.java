package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ph implements Runnable {
    public final int f18143a;
    public final Utilities.Callback2 f18144b;
    public final Exception f18145c;

    public ph(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18143a = i10;
        this.f18144b = callback2;
        this.f18145c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18143a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18144b, this.f18145c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18144b, this.f18145c);
                return;
        }
    }
}
