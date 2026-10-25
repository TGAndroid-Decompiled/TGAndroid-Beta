package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class mh implements Runnable {
    public final int f20702a;
    public final Utilities.Callback2 f20703b;
    public final Exception f20704c;

    public mh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f20702a = i10;
        this.f20703b = callback2;
        this.f20704c = exc;
    }

    @Override
    public final void run() {
        switch (this.f20702a) {
            case 0:
                PasskeysController.lambda$create$3(this.f20703b, this.f20704c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f20703b, this.f20704c);
                return;
        }
    }
}
