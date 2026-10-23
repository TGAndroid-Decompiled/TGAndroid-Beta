package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class tl implements Runnable {
    public final int f19641a;
    public final Serializable f19642b;
    public final Serializable f19643c;
    public final Object d;

    public tl(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f19641a = i10;
        this.f19642b = serializable;
        this.f19643c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f19641a) {
            case 0:
                Utilities.a((int[]) this.f19642b, (Utilities.Callback[]) this.f19643c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19642b, (String) this.f19643c, (byte[]) this.d);
                return;
        }
    }
}
