package h9;

import a8.ka;
import java.util.Map;
public final class r extends k {
    public final Object f14083a;
    public int f14084b;
    public final s f14085c;

    public r(s sVar, int i7) {
        this.f14085c = sVar;
        Object obj = s.f14088s;
        this.f14083a = sVar.k()[i7];
        this.f14084b = i7;
    }

    public final void a() {
        int i7 = this.f14084b;
        Object obj = this.f14083a;
        s sVar = this.f14085c;
        if (i7 != -1 && i7 < sVar.size()) {
            if (ka.a(obj, sVar.k()[this.f14084b])) {
                return;
            }
        }
        Object obj2 = s.f14088s;
        this.f14084b = sVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14083a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f14085c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.f14083a);
        }
        a();
        int i7 = this.f14084b;
        if (i7 == -1) {
            return null;
        }
        return sVar.l()[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f14085c;
        Map d = sVar.d();
        Object obj2 = this.f14083a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i7 = this.f14084b;
        if (i7 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i7];
        sVar.l()[this.f14084b] = obj;
        return obj3;
    }
}
