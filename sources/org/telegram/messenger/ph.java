package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ph implements Runnable {
    public final int f18120a;
    public final Utilities.Callback2 f18121b;
    public final Exception f18122c;

    public ph(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18120a = i10;
        this.f18121b = callback2;
        this.f18122c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18120a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18121b, this.f18122c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18121b, this.f18122c);
                return;
        }
    }
}
