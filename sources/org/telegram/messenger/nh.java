package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f17102a;
    public final Utilities.Callback2 f17103b;
    public final Exception f17104c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f17102a = i10;
        this.f17103b = callback2;
        this.f17104c = exc;
    }

    @Override
    public final void run() {
        switch (this.f17102a) {
            case 0:
                PasskeysController.lambda$create$3(this.f17103b, this.f17104c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f17103b, this.f17104c);
                return;
        }
    }
}
