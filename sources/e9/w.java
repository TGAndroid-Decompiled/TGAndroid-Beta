package e9;

import java.util.Map;
import v7.s6;
public final class w extends n {
    public final Object f6435a;
    public int f6436b;
    public final x f6437c;

    public w(x xVar, int i10) {
        this.f6437c = xVar;
        Object obj = x.f6443s;
        this.f6435a = xVar.j()[i10];
        this.f6436b = i10;
    }

    public final void a() {
        int i10 = this.f6436b;
        Object obj = this.f6435a;
        x xVar = this.f6437c;
        if (i10 != -1 && i10 < xVar.size()) {
            if (s6.a(obj, xVar.j()[this.f6436b])) {
                return;
            }
        }
        Object obj2 = x.f6443s;
        this.f6436b = xVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f6435a;
    }

    @Override
    public final Object getValue() {
        x xVar = this.f6437c;
        Map c10 = xVar.c();
        if (c10 != null) {
            return c10.get(this.f6435a);
        }
        a();
        int i10 = this.f6436b;
        if (i10 == -1) {
            return null;
        }
        return xVar.k()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        x xVar = this.f6437c;
        Map c10 = xVar.c();
        Object obj2 = this.f6435a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.f6436b;
        if (i10 == -1) {
            xVar.put(obj2, obj);
            return null;
        }
        Object obj3 = xVar.k()[i10];
        xVar.k()[this.f6436b] = obj;
        return obj3;
    }
}
