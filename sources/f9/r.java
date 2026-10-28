package f9;

import a8.xb;
import java.util.Map;
public final class r extends k {
    public final Object f10326a;
    public int f10327b;
    public final s f10328c;

    public r(s sVar, int i10) {
        this.f10328c = sVar;
        Object obj = s.f10334s;
        this.f10326a = sVar.j()[i10];
        this.f10327b = i10;
    }

    public final void a() {
        int i10 = this.f10327b;
        Object obj = this.f10326a;
        s sVar = this.f10328c;
        if (i10 != -1 && i10 < sVar.size()) {
            if (xb.a(obj, sVar.j()[this.f10327b])) {
                return;
            }
        }
        Object obj2 = s.f10334s;
        this.f10327b = sVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f10326a;
    }

    @Override
    public final Object getValue() {
        s sVar = this.f10328c;
        Map c10 = sVar.c();
        if (c10 != null) {
            return c10.get(this.f10326a);
        }
        a();
        int i10 = this.f10327b;
        if (i10 == -1) {
            return null;
        }
        return sVar.k()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        s sVar = this.f10328c;
        Map c10 = sVar.c();
        Object obj2 = this.f10326a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.f10327b;
        if (i10 == -1) {
            sVar.put(obj2, obj);
            return null;
        }
        Object obj3 = sVar.k()[i10];
        sVar.k()[this.f10327b] = obj;
        return obj3;
    }
}
