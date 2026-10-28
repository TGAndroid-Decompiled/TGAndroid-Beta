package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class el implements Runnable {
    public final int f20027a;
    public final Object f20028b;
    public final Serializable f20029c;
    public final Object d;

    public el(Object obj, Serializable serializable, Object obj2, int i10) {
        this.f20027a = i10;
        this.f20028b = obj;
        this.f20029c = serializable;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20027a) {
            case 0:
                ((TranslateController) this.f20028b).lambda$checkDialogMessageSure$10((ArrayList) this.f20029c, (ArrayList) this.d);
                return;
            case 1:
                Utilities.a((int[]) this.f20028b, (Utilities.Callback[]) this.f20029c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f20028b, (String) this.f20029c, (byte[]) this.d);
                return;
        }
    }
}
