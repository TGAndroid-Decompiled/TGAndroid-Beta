package n7;

import java.util.Map;
public final class c extends l7.f {
    public final Object f14304b;
    public int f14305c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f14320c;
        objArr.getClass();
        this.f14304b = objArr[i10];
        this.f14305c = i10;
    }

    public final void a() {
        int i10 = this.f14305c;
        Object obj = this.f14304b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f14305c;
            Object[] objArr = dVar.f14320c;
            objArr.getClass();
            if (k7.d0.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f14317s;
        this.f14305c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14304b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f14304b);
        }
        a();
        int i10 = this.f14305c;
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
        Map a2 = dVar.a();
        Object obj2 = this.f14304b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f14305c;
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
