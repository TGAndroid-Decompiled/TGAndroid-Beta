package h9;

import a8.ha;
import java.util.Map;
public final class r extends k {
    public final Object f14377a;
    public int f14378b;
    public final s f14379c;

    public r(s sVar, int i7) {
        this.f14379c = sVar;
        Object obj = s.f14382s;
        this.f14377a = sVar.k()[i7];
        this.f14378b = i7;
    }

    public final void a() {
        int i7 = this.f14378b;
        Object obj = this.f14377a;
        s sVar = this.f14379c;
        if (i7 != -1 && i7 < sVar.size()) {
            if (ha.a(obj, sVar.k()[this.f14378b])) {
                return;
            }
        }
        Object obj2 = s.f14382s;
        this.f14378b = sVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14377a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f14379c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.f14377a);
        }
        a();
        int i7 = this.f14378b;
        if (i7 == -1) {
            return null;
        }
        return sVar.l()[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f14379c;
        Map d = sVar.d();
        Object obj2 = this.f14377a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i7 = this.f14378b;
        if (i7 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i7];
        sVar.l()[this.f14378b] = obj;
        return obj3;
    }
}
