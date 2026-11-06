package ae;

import java.util.LinkedHashMap;
import m1.u0;
import m1.v0;
import zd.l0;
import zd.y1;
public final class c implements l0 {
    public final int f1045a;
    public final Object f1046b;
    public final Object f1047c;

    public c(int i7, Object obj, Object obj2) {
        this.f1045a = i7;
        this.f1046b = obj;
        this.f1047c = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.f1045a) {
            case 0:
                ((e) this.f1046b).f1051c.removeCallbacks((y1) this.f1047c);
                return;
            default:
                String str = (String) this.f1046b;
                u0 u0Var = (u0) this.f1047c;
                synchronized (v0.f19488b) {
                    LinkedHashMap linkedHashMap = v0.f19489c;
                    v0 v0Var = (v0) linkedHashMap.get(str);
                    if (v0Var != null) {
                        v0Var.f19490a.remove(u0Var);
                        if (v0Var.f19490a.isEmpty()) {
                            linkedHashMap.remove(str);
                            v0Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
