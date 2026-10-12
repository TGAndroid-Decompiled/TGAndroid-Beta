package e9;

import java.util.Map;
import v7.t6;
public final class w extends n {
    public final Object f8637a;
    public int f8638b;
    public final x f8639c;

    public w(x xVar, int i10) {
        this.f8639c = xVar;
        Object obj = x.f8645s;
        this.f8637a = xVar.j()[i10];
        this.f8638b = i10;
    }

    public final void a() {
        int i10 = this.f8638b;
        Object obj = this.f8637a;
        x xVar = this.f8639c;
        if (i10 != -1 && i10 < xVar.size()) {
            if (t6.a(obj, xVar.j()[this.f8638b])) {
                return;
            }
        }
        Object obj2 = x.f8645s;
        this.f8638b = xVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8637a;
    }

    @Override
    public final Object getValue() {
        x xVar = this.f8639c;
        Map c10 = xVar.c();
        if (c10 != null) {
            return c10.get(this.f8637a);
        }
        a();
        int i10 = this.f8638b;
        if (i10 == -1) {
            return null;
        }
        return xVar.k()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        x xVar = this.f8639c;
        Map c10 = xVar.c();
        Object obj2 = this.f8637a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.f8638b;
        if (i10 == -1) {
            xVar.put(obj2, obj);
            return null;
        }
        Object obj3 = xVar.k()[i10];
        xVar.k()[this.f8638b] = obj;
        return obj3;
    }
}
