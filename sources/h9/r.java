package h9;

import a8.ka;
import java.util.Map;
public final class r extends k {
    public final Object f14051a;
    public int f14052b;
    public final s f14053c;

    public r(s sVar, int i7) {
        this.f14053c = sVar;
        Object obj = s.f14056s;
        this.f14051a = sVar.k()[i7];
        this.f14052b = i7;
    }

    public final void a() {
        int i7 = this.f14052b;
        Object obj = this.f14051a;
        s sVar = this.f14053c;
        if (i7 != -1 && i7 < sVar.size()) {
            if (ka.a(obj, sVar.k()[this.f14052b])) {
                return;
            }
        }
        Object obj2 = s.f14056s;
        this.f14052b = sVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14051a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f14053c;
        Map d = sVar.d();
        if (d != null) {
            return d.get(this.f14051a);
        }
        a();
        int i7 = this.f14052b;
        if (i7 == -1) {
            return null;
        }
        return sVar.l()[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f14053c;
        Map d = sVar.d();
        Object obj2 = this.f14051a;
        if (d != null) {
            return d.put(obj2, obj);
        }
        a();
        int i7 = this.f14052b;
        if (i7 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.l()[i7];
        sVar.l()[this.f14052b] = obj;
        return obj3;
    }
}
