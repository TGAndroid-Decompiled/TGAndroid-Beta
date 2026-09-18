package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f8130a;
    public int f8131b;
    public final v f8132c;

    public u(v vVar, int i10) {
        this.f8132c = vVar;
        Object obj = v.f8134s;
        this.f8130a = vVar.i()[i10];
        this.f8131b = i10;
    }

    public final void a() {
        int i10 = this.f8131b;
        Object obj = this.f8130a;
        v vVar = this.f8132c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f8131b])) {
                return;
            }
        }
        Object obj2 = v.f8134s;
        this.f8131b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8130a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8132c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8130a);
        }
        a();
        int i10 = this.f8131b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8132c;
        Map b10 = vVar.b();
        Object obj2 = this.f8130a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8131b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8131b] = obj;
        return obj3;
    }
}
