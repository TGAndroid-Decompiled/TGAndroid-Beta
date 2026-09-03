package n7;

import java.util.Map;
public final class c extends l7.f {
    public final Object f14289b;
    public int f14290c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f14305c;
        objArr.getClass();
        this.f14289b = objArr[i10];
        this.f14290c = i10;
    }

    public final void a() {
        int i10 = this.f14290c;
        Object obj = this.f14289b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f14290c;
            Object[] objArr = dVar.f14305c;
            objArr.getClass();
            if (k7.d0.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f14302s;
        this.f14290c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14289b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f14289b);
        }
        a();
        int i10 = this.f14290c;
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
        Object obj2 = this.f14289b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f14290c;
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
