package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class bm implements Runnable {
    public final int f17213a;
    public final Serializable f17214b;
    public final Serializable f17215c;
    public final Object d;

    public bm(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f17213a = i10;
        this.f17214b = serializable;
        this.f17215c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f17213a) {
            case 0:
                Utilities.a((int[]) this.f17214b, (Utilities.Callback[]) this.f17215c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f17214b, (String) this.f17215c, (byte[]) this.d);
                return;
        }
    }
}
