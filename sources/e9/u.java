package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f8113a;
    public int f8114b;
    public final v f8115c;

    public u(v vVar, int i10) {
        this.f8115c = vVar;
        Object obj = v.f8117s;
        this.f8113a = vVar.i()[i10];
        this.f8114b = i10;
    }

    public final void a() {
        int i10 = this.f8114b;
        Object obj = this.f8113a;
        v vVar = this.f8115c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f8114b])) {
                return;
            }
        }
        Object obj2 = v.f8117s;
        this.f8114b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8113a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8115c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8113a);
        }
        a();
        int i10 = this.f8114b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8115c;
        Map b10 = vVar.b();
        Object obj2 = this.f8113a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8114b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8114b] = obj;
        return obj3;
    }
}
