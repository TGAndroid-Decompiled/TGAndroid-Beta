package defpackage;

import java.util.HashMap;
import java.util.Map;
public final class tj2 {
    public final HashMap a;

    public tj2(byte b) {
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
            gl.r(runnable2);
        }
    }

    public final void b() {
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            gl.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }
}
