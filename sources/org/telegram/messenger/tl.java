package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class tl implements Runnable {
    public final int f19706a;
    public final Serializable f19707b;
    public final Serializable f19708c;
    public final Object d;

    public tl(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f19706a = i10;
        this.f19707b = serializable;
        this.f19708c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f19706a) {
            case 0:
                Utilities.a((int[]) this.f19707b, (Utilities.Callback[]) this.f19708c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19707b, (String) this.f19708c, (byte[]) this.d);
                return;
        }
    }
}
