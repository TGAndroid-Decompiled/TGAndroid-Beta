package e9;

import java.util.Map;
import v7.s6;
public final class u extends m {
    public final Object f9007a;
    public int f9008b;
    public final v f9009c;

    public u(v vVar, int i10) {
        this.f9009c = vVar;
        Object obj = v.f9011s;
        this.f9007a = vVar.i()[i10];
        this.f9008b = i10;
    }

    public final void a() {
        int i10 = this.f9008b;
        Object obj = this.f9007a;
        v vVar = this.f9009c;
        if (i10 != -1 && i10 < vVar.size()) {
            if (s6.a(obj, vVar.i()[this.f9008b])) {
                return;
            }
        }
        Object obj2 = v.f9011s;
        this.f9008b = vVar.d(obj);
    }

    @Override
    public final Object getKey() {
        return this.f9007a;
    }

    @Override
    public final Object getValue() {
        v vVar = this.f9009c;
        Map b10 = vVar.b();
        if (b10 != null) {
            return b10.get(this.f9007a);
        }
        a();
        int i10 = this.f9008b;
        if (i10 == -1) {
            return null;
        }
        return vVar.j()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        v vVar = this.f9009c;
        Map b10 = vVar.b();
        Object obj2 = this.f9007a;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i10 = this.f9008b;
        if (i10 == -1) {
            vVar.put(obj2, obj);
            return null;
        }
        Object obj3 = vVar.j()[i10];
        vVar.j()[this.f9008b] = obj;
        return obj3;
    }
}
