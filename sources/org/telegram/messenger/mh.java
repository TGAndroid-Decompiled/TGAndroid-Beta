package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f18410a;
    public final Utilities.Callback2 f18411b;
    public final Exception f18412c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18410a = i10;
        this.f18411b = callback2;
        this.f18412c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18410a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18411b, this.f18412c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18411b, this.f18412c);
                return;
        }
    }
}
