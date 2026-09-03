package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ph implements Runnable {
    public final int f18121a;
    public final Utilities.Callback2 f18122b;
    public final Exception f18123c;

    public ph(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18121a = i10;
        this.f18122b = callback2;
        this.f18123c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18121a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18122b, this.f18123c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18122b, this.f18123c);
                return;
        }
    }
}
