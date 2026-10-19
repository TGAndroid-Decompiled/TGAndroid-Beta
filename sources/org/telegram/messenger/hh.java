package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class hh implements Runnable {
    public final int f18533a;
    public final Utilities.Callback2 f18534b;
    public final Exception f18535c;

    public hh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18533a = i10;
        this.f18534b = callback2;
        this.f18535c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18533a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18534b, this.f18535c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18534b, this.f18535c);
                return;
        }
    }
}
