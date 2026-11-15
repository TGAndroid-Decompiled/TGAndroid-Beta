package h9;

import a8.ia;
import java.util.Map;
public final class r extends k {
    public final Object f13732a;
    public int f13733b;
    public final s f13734c;

    public r(s sVar, int i7) {
        this.f13734c = sVar;
        Object obj = s.f13741s;
        this.f13732a = sVar.k()[i7];
        this.f13733b = i7;
    }

    public final void a() {
        int i7 = this.f13733b;
        Object obj = this.f13732a;
        s sVar = this.f13734c;
        if (i7 != -1 && i7 < sVar.size()) {
            if (ia.a(obj, sVar.k()[this.f13733b])) {
                return;
            }
        }
        Object obj2 = s.f13741s;
        this.f13733b = sVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f13732a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f13734c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.f13732a);
        }
        a();
        int i7 = this.f13733b;
        if (i7 == -1) {
            return null;
        }
        return sVar.l()[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f13734c;
        Map d = sVar.d();
        Object obj2 = this.f13732a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i7 = this.f13733b;
        if (i7 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i7];
        sVar.l()[this.f13733b] = obj;
        return obj3;
    }
}
