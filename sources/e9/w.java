package e9;

import java.util.Map;
import v7.t6;
public final class w extends n {
    public final Object f8521a;
    public int f8522b;
    public final x f8523c;

    public w(x xVar, int i10) {
        this.f8523c = xVar;
        Object obj = x.f8529s;
        this.f8521a = xVar.j()[i10];
        this.f8522b = i10;
    }

    public final void a() {
        int i10 = this.f8522b;
        Object obj = this.f8521a;
        x xVar = this.f8523c;
        if (i10 != -1 && i10 < xVar.size()) {
            if (t6.a(obj, xVar.j()[this.f8522b])) {
                return;
            }
        }
        Object obj2 = x.f8529s;
        this.f8522b = xVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8521a;
    }

    @Override
    public final Object getValue() {
        x xVar = this.f8523c;
        Map c10 = xVar.c();
        if (c10 != null) {
            return c10.get(this.f8521a);
        }
        a();
        int i10 = this.f8522b;
        if (i10 == -1) {
            return null;
        }
        return xVar.k()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        x xVar = this.f8523c;
        Map c10 = xVar.c();
        Object obj2 = this.f8521a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.f8522b;
        if (i10 == -1) {
            xVar.put(obj2, obj);
            return null;
        }
        Object obj3 = xVar.k()[i10];
        xVar.k()[this.f8522b] = obj;
        return obj3;
    }
}
