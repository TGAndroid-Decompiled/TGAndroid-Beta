package h9;

import a8.ka;
import java.util.Map;
public final class r extends k {
    public final Object f14054a;
    public int f14055b;
    public final s f14056c;

    public r(s sVar, int i7) {
        this.f14056c = sVar;
        Object obj = s.f14059s;
        this.f14054a = sVar.k()[i7];
        this.f14055b = i7;
    }

    public final void a() {
        int i7 = this.f14055b;
        Object obj = this.f14054a;
        s sVar = this.f14056c;
        if (i7 != -1 && i7 < sVar.size()) {
            if (ka.a(obj, sVar.k()[this.f14055b])) {
                return;
            }
        }
        Object obj2 = s.f14059s;
        this.f14055b = sVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14054a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f14056c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.f14054a);
        }
        a();
        int i7 = this.f14055b;
        if (i7 == -1) {
            return null;
        }
        return sVar.l()[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f14056c;
        Map d = sVar.d();
        Object obj2 = this.f14054a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i7 = this.f14055b;
        if (i7 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i7];
        sVar.l()[this.f14055b] = obj;
        return obj3;
    }
}
