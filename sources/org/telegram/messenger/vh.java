package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class vh implements Runnable {
    public final int f16603a;
    public final Utilities.Callback2 f16604b;
    public final Exception f16605c;

    public vh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f16603a = i10;
        this.f16604b = callback2;
        this.f16605c = exc;
    }

    @Override
    public final void run() {
        switch (this.f16603a) {
            case 0:
                PasskeysController.lambda$create$3(this.f16604b, this.f16605c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f16604b, this.f16605c);
                return;
        }
    }
}
