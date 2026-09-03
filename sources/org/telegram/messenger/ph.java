package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ph implements Runnable {
    public final int f19703a;
    public final Utilities.Callback2 f19704b;
    public final Exception f19705c;

    public ph(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f19703a = i10;
        this.f19704b = callback2;
        this.f19705c = exc;
    }

    @Override
    public final void run() {
        switch (this.f19703a) {
            case 0:
                PasskeysController.lambda$create$3(this.f19704b, this.f19705c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f19704b, this.f19705c);
                return;
        }
    }
}
