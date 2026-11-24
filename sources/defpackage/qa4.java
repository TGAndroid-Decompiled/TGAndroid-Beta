package defpackage;

import java.util.HashMap;
import java.util.Map;
public final class qa4 {
    public final HashMap a;

    public qa4(byte b) {
        switch (b) {
            case 1:
                this.a = new HashMap();
                return;
            default:
                this.a = new HashMap();
                return;
        }
    }

    public final void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.a.remove(runnable);
        if (runnable2 != null) {
            gm.r(runnable2);
        }
    }

    public final void b() {
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            gm.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }
}
