package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class sl implements Runnable {
    public final int f19550a;
    public final Serializable f19551b;
    public final Serializable f19552c;
    public final Object d;

    public sl(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f19550a = i10;
        this.f19551b = serializable;
        this.f19552c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f19550a) {
            case 0:
                Utilities.a((int[]) this.f19551b, (Utilities.Callback[]) this.f19552c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19551b, (String) this.f19552c, (byte[]) this.d);
                return;
        }
    }
}
