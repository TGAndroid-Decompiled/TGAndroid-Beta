package f9;

import a8.xb;
import java.util.Map;
public final class r extends k {
    public final Object f10327a;
    public int f10328b;
    public final s f10329c;

    public r(s sVar, int i10) {
        this.f10329c = sVar;
        Object obj = s.f10335s;
        this.f10327a = sVar.j()[i10];
        this.f10328b = i10;
    }

    public final void a() {
        int i10 = this.f10328b;
        Object obj = this.f10327a;
        s sVar = this.f10329c;
        if (i10 != -1 && i10 < sVar.size()) {
            if (xb.a(obj, sVar.j()[this.f10328b])) {
                return;
            }
        }
        Object obj2 = s.f10335s;
        this.f10328b = sVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f10327a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f10329c;
        Map c10 = sVar.c();
        if (c10 != null) {
            return c10.get(this.f10327a);
        }
        a();
        int i10 = this.f10328b;
        if (i10 == -1) {
            return null;
        }
        return sVar.k()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f10329c;
        Map c10 = sVar.c();
        Object obj2 = this.f10327a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.f10328b;
        if (i10 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.k()[i10];
        sVar.k()[this.f10328b] = obj;
        return obj3;
    }
}
