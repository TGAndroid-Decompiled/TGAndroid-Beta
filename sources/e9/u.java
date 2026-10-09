package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f8802a;
    public int f8803b;
    public final v f8804c;

    public u(v vVar, int i10) {
        this.f8804c = vVar;
        Object obj = v.f8806s;
        this.f8802a = vVar.i()[i10];
        this.f8803b = i10;
    }

    public final void a() {
        int i10 = this.f8803b;
        Object obj = this.f8802a;
        v vVar = this.f8804c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f8803b])) {
                return;
            }
        }
        Object obj2 = v.f8806s;
        this.f8803b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8802a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f8804c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f8802a);
        }
        a();
        int i10 = this.f8803b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f8804c;
        Map b10 = vVar.b();
        Object obj2 = this.f8802a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f8803b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f8803b] = obj;
        return obj3;
    }
}
