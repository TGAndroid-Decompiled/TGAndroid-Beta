package ae;

import java.util.LinkedHashMap;
import m1.u0;
import m1.v0;
import zd.l0;
import zd.y1;
public final class c implements l0 {
    public final int f1043a;
    public final Object f1044b;
    public final Object f1045c;

    public c(int i7, Object obj, Object obj2) {
        this.f1043a = i7;
        this.f1044b = obj;
        this.f1045c = obj2;
    }

    @Override
    public final void dispose() {
        switch (this.f1043a) {
            case 0:
                ((e) this.f1044b).f1049c.removeCallbacks((y1) this.f1045c);
                return;
            default:
                String str = (String) this.f1044b;
                u0 u0Var = (u0) this.f1045c;
                synchronized (v0.f20085b) {
                    LinkedHashMap linkedHashMap = v0.f20086c;
                    v0 v0Var = (v0) linkedHashMap.get(str);
                    if (v0Var != null) {
                        v0Var.f20087a.remove(u0Var);
                        if (v0Var.f20087a.isEmpty()) {
                            linkedHashMap.remove(str);
                            v0Var.stopWatching();
                        }
                    }
                }
                return;
        }
    }
}
