package e9;

import java.util.Map;
import v7.t6;
public final class w extends n {
    public final Object f8520a;
    public int f8521b;
    public final x f8522c;

    public w(x xVar, int i10) {
        this.f8522c = xVar;
        Object obj = x.f8528s;
        this.f8520a = xVar.j()[i10];
        this.f8521b = i10;
    }

    public final void a() {
        int i10 = this.f8521b;
        Object obj = this.f8520a;
        x xVar = this.f8522c;
        if (i10 != -1 && i10 < xVar.size()) {
            if (t6.a(obj, xVar.j()[this.f8521b])) {
                return;
            }
        }
        Object obj2 = x.f8528s;
        this.f8521b = xVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f8520a;
    }

    @Override
    public final Object getValue() {
        x xVar = this.f8522c;
        Map c10 = xVar.c();
        if (c10 != null) {
            return c10.get(this.f8520a);
        }
        a();
        int i10 = this.f8521b;
        if (i10 == -1) {
            return null;
        }
        return xVar.k()[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        x xVar = this.f8522c;
        Map c10 = xVar.c();
        Object obj2 = this.f8520a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i10 = this.f8521b;
        if (i10 == -1) {
            xVar.put(obj2, obj);
            return null;
        }
        Object obj3 = xVar.k()[i10];
        xVar.k()[this.f8521b] = obj;
        return obj3;
    }
}
