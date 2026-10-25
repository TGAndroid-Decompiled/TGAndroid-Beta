package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class dl implements Runnable {
    public final int f19938a;
    public final Object f19939b;
    public final Serializable f19940c;
    public final Object d;

    public dl(Object obj, Serializable serializable, Object obj2, int i10) {
        this.f19938a = i10;
        this.f19939b = obj;
        this.f19940c = serializable;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19938a) {
            case 0:
                ((TranslateController) this.f19939b).lambda$checkDialogMessageSure$10((ArrayList) this.f19940c, (ArrayList) this.d);
                return;
            case 1:
                Utilities.a((int[]) this.f19939b, (Utilities.Callback[]) this.f19940c, (Runnable) this.d);
                return;
            default:
                WearAuthListenerService.a((String) this.f19939b, (String) this.f19940c, (byte[]) this.d);
                return;
        }
    }
}
