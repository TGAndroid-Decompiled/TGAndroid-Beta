package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class bm implements Runnable {
    public final int f17212a;
    public final Serializable f17213b;
    public final Serializable f17214c;
    public final Object d;

    public bm(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f17212a = i10;
        this.f17213b = serializable;
        this.f17214c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f17212a) {
            case 0:
                Utilities.a((int[]) this.f17213b, (Utilities.Callback[]) this.f17214c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f17213b, (String) this.f17214c, (byte[]) this.d);
                return;
        }
    }
}
