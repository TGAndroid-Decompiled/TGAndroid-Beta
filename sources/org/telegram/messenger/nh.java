package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f18486a;
    public final Utilities.Callback2 f18487b;
    public final Exception f18488c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18486a = i10;
        this.f18487b = callback2;
        this.f18488c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18486a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18487b, this.f18488c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18487b, this.f18488c);
                return;
        }
    }
}
