package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public final class y99 {
    public final HashMap a;

    public y99(Set set) {
        this.a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            x99 x99Var = (x99) it.next();
            HashMap hashMap = this.a;
            x99Var.getClass();
            hashMap.put(n53.class, x99Var.a);
        }
    }

    public final void a(Runnable runnable) {
        Runnable runnable2 = (Runnable) this.a.remove(runnable);
        if (runnable2 != null) {
            hl.r(runnable2);
        }
    }

    public final void b() {
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            hl.r((Runnable) entry.getValue());
        }
        hashMap.clear();
    }

    public y99(byte b) {
        switch (b) {
            case 2:
                this.a = new HashMap();
                return;
            default:
                this.a = new HashMap();
                return;
        }
    }
}
