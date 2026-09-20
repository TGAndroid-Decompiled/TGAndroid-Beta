package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f17087a;
    public final Utilities.Callback2 f17088b;
    public final Exception f17089c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17087a = i10;
        this.f17088b = callback2;
        this.f17089c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17087a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17088b, this.f17089c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17088b, this.f17089c);
                return;
        }
    }
}
