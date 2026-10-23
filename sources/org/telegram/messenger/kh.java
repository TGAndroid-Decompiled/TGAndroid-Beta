package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class kh implements Runnable {
    public final int f18873a;
    public final Utilities.Callback2 f18874b;
    public final Exception f18875c;

    public kh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18873a = i10;
        this.f18874b = callback2;
        this.f18875c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18873a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18874b, this.f18875c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18874b, this.f18875c);
                return;
        }
    }
}
