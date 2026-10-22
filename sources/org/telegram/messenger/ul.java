package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class ul implements Runnable {
    public final int f19717a;
    public final Serializable f19718b;
    public final Serializable f19719c;
    public final Object d;

    public ul(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f19717a = i10;
        this.f19718b = serializable;
        this.f19719c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f19717a) {
            case 0:
                Utilities.a((int[]) this.f19718b, (Utilities.Callback[]) this.f19719c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19718b, (String) this.f19719c, (byte[]) this.d);
                return;
        }
    }
}
