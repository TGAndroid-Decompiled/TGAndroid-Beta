package org.telegram.messenger;

import java.io.Serializable;
import org.telegram.messenger.Utilities;
public final class ul implements Runnable {
    public final int f19782a;
    public final Serializable f19783b;
    public final Serializable f19784c;
    public final Object d;

    public ul(Serializable serializable, Serializable serializable2, Object obj, int i10) {
        this.f19782a = i10;
        this.f19783b = serializable;
        this.f19784c = serializable2;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f19782a) {
            case 0:
                Utilities.a((int[]) this.f19783b, (Utilities.Callback[]) this.f19784c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19783b, (String) this.f19784c, (byte[]) this.d);
                return;
        }
    }
}
