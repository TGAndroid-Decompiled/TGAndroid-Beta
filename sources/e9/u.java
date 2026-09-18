package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f8129a;
    public int f8130b;
    public final v f8131c;

    public u(v vVar, int i10) {
        this.f8131c = vVar;
        Object obj = v.f8133s;
        this.f8129a = vVar.i()[i10];
        this.f8130b = i10;
    }

    public final void a() {
        int i10 = this.f8130b;
        Object obj = this.f8129a;
        v vVar = this.f8131c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f8130b])) {
                return;
            }
        }
        Object obj2 = v.f8133s;
        this.f8130b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8129a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8131c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8129a);
        }
        a();
        int i10 = this.f8130b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8131c;
        Map b10 = vVar.b();
        Object obj2 = this.f8129a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8130b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8130b] = obj;
        return obj3;
    }
}
