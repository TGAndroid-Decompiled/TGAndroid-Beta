package h9;

import a8.la;
import java.util.Map;
public final class r extends k {
    public final Object f14041a;
    public int f14042b;
    public final s f14043c;

    public r(s sVar, int i7) {
        this.f14043c = sVar;
        Object obj = s.f14050s;
        this.f14041a = sVar.k()[i7];
        this.f14042b = i7;
    }

    public final void a() {
        int i7 = this.f14042b;
        Object obj = this.f14041a;
        s sVar = this.f14043c;
        if (i7 != -1 && i7 < sVar.size()) {
            if (la.a(obj, sVar.k()[this.f14042b])) {
                return;
            }
        }
        Object obj2 = s.f14050s;
        this.f14042b = sVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14041a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f14043c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.f14041a);
        }
        a();
        int i7 = this.f14042b;
        if (i7 == -1) {
            return null;
        }
        return sVar.l()[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f14043c;
        Map d = sVar.d();
        Object obj2 = this.f14041a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i7 = this.f14042b;
        if (i7 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i7];
        sVar.l()[this.f14042b] = obj;
        return obj3;
    }
}
