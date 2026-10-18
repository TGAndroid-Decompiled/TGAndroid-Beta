package e9;

import java.util.Map;
import v7.t6;
public final class w extends n {
    public final Object f8522a;
    public int f8523b;
    public final x f8524c;

    public w(x xVar, int i10) {
        this.f8524c = xVar;
        Object obj = x.f8530s;
        this.f8522a = xVar.j()[i10];
        this.f8523b = i10;
    }

    public final void a() {
        int i10 = this.f8523b;
        Object obj = this.f8522a;
        x xVar = this.f8524c;
        if (i10 != -1 && i10 < xVar.size()) {
            if (t6.a(obj, xVar.j()[this.f8523b])) {
                return;
            }
        }
        Object obj2 = x.f8530s;
        this.f8523b = xVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8522a;
    }

    @Override
    public final Object getValue() {
        x xVar = this.f8524c;
        Map c10 = xVar.c();
        if (c10 != null) {
            return c10.get(this.f8522a);
        }
        a();
        int i10 = this.f8523b;
        if (i10 == -1) {
            return null;
        }
        return xVar.k()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        x xVar = this.f8524c;
        Map c10 = xVar.c();
        Object obj2 = this.f8522a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.f8523b;
        if (i10 == -1) {
            xVar.put(obj2, obj);
            return null;
        }
        Object obj3 = xVar.k()[i10];
        xVar.k()[this.f8523b] = obj;
        return obj3;
    }
}
