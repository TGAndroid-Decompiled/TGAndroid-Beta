package e9;

import java.util.Map;
import v7.t6;
public final class u extends m {
    public final Object f8114a;
    public int f8115b;
    public final v f8116c;

    public u(v vVar, int i10) {
        this.f8116c = vVar;
        Object obj = v.f8118s;
        this.f8114a = vVar.i()[i10];
        this.f8115b = i10;
    }

    public final void a() {
        int i10 = this.f8115b;
        Object obj = this.f8114a;
        v vVar = this.f8116c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (t6.a(obj, vVar.i()[this.f8115b])) {
                return;
            }
        }
        Object obj2 = v.f8118s;
        this.f8115b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8114a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8116c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8114a);
        }
        a();
        int i10 = this.f8115b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8116c;
        Map b10 = vVar.b();
        Object obj2 = this.f8114a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8115b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8115b] = obj;
        return obj3;
    }
}
