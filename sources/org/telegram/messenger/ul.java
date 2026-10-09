package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class ul implements Runnable {
    public final int f19374a;
    public final Serializable f19375b;
    public final Serializable f19376c;
    public final Object d;

    public ul(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f19374a = i10;
        this.f19375b = serializable;
        this.f19376c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f19374a) {
            case 0:
                Utilities.a((int[]) this.f19375b, (Utilities.Callback[]) this.f19376c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19375b, (String) this.f19376c, (byte[]) this.d);
                return;
        }
    }
}
