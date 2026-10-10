package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class ul implements Runnable {
    public final int f19378a;
    public final Serializable f19379b;
    public final Serializable f19380c;
    public final Object d;

    public ul(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f19378a = i10;
        this.f19379b = serializable;
        this.f19380c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f19378a) {
            case 0:
                Utilities.a((int[]) this.f19379b, (Utilities.Callback[]) this.f19380c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19379b, (String) this.f19380c, (byte[]) this.d);
                return;
        }
    }
}
