package org.telegram.messenger;

import org.telegram.messenger.Utilities;
public final class nh implements Runnable {
    public final int f18513a;
    public final Utilities.Callback2 f18514b;
    public final Exception f18515c;

    public nh(Utilities.Callback2 callback2, Exception exc, int i10) {
        this.f18513a = i10;
        this.f18514b = callback2;
        this.f18515c = exc;
    }

    @Override
    public final void run() {
        switch (this.f18513a) {
            case 0:
                PasskeysController.lambda$create$3(this.f18514b, this.f18515c);
                return;
            default:
                PasskeysController.lambda$create$8(this.f18514b, this.f18515c);
                return;
        }
    }
}
