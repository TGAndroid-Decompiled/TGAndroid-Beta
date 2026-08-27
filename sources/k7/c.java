package k7;

import java.util.Map;

public final class c extends i7.f {

    public final Object f14511b;

    public int f14512c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f14531c;
        objArr.getClass();
        this.f14511b = objArr[i10];
        this.f14512c = i10;
    }

    public final void a() {
        int i10 = this.f14512c;
        Object obj = this.f14511b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f14512c;
            Object[] objArr = dVar.f14531c;
            objArr.getClass();
            if (g7.x8.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f14528s;
        this.f14512c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14511b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map mapA = dVar.a();
        if (mapA != null) {
            return mapA.get(this.f14511b);
        }
        a();
        int i10 = this.f14512c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        d dVar = this.d;
        Map mapA = dVar.a();
        Object obj2 = this.f14511b;
        if (mapA != null) {
            return mapA.put(obj2, obj);
        }
        a();
        int i10 = this.f14512c;
        if (i10 == -1) {
            dVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }
}
