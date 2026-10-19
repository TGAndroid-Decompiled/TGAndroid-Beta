package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class ih implements Runnable {
    public final int f18610a;
    public final Utilities.Callback2 f18611b;
    public final Exception f18612c;

    public ih(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18610a = i10;
        this.f18611b = callback2;
        this.f18612c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18610a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18611b, this.f18612c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18611b, this.f18612c);
                return;
        }
    }
}
