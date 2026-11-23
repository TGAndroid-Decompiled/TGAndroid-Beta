package ae;

import java.util.LinkedHashMap;
import m1.u0;
import m1.v0;
import zd.l0;
import zd.y1;
public final class c implements l0 {
    public final int f1042a;
    public final Object f1043b;
    public final Object f1044c;

    public c(int i7, Object obj, Object obj2) {
        this.f1042a = i7;
        this.f1043b = obj;
        this.f1044c = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.f1042a) {
            case 0:
                ((e) this.f1043b).f1048c.removeCallbacks((y1) this.f1044c);
                return;
            default:
                String str = (String) this.f1043b;
                u0 u0Var = (u0) this.f1044c;
                synchronized (v0.f20480b) {
                    LinkedHashMap linkedHashMap = v0.f20481c;
                    v0 v0Var = (v0) linkedHashMap.get(str);
                    if (v0Var != null) {
                        v0Var.f20482a.remove(u0Var);
                        if (v0Var.f20482a.isEmpty()) {
                            linkedHashMap.remove(str);
                            v0Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
