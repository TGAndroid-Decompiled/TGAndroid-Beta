package c8;

import java.util.Map;
public final class c extends a8.g {
    public final Object f4497b;
    public int f4498c;
    public final d d;

    public c(d dVar, int i7) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f4519c;
        objArr.getClass();
        this.f4497b = objArr[i7];
        this.f4498c = i7;
    }

    public final void a() {
        int i7 = this.f4498c;
        Object obj = this.f4497b;
        d dVar = this.d;
        if (i7 != -1 && i7 < dVar.size()) {
            int i10 = this.f4498c;
            Object[] objArr = dVar.f4519c;
            objArr.getClass();
            if (a8.g8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = d.f4516s;
        this.f4498c = dVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f4497b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map b10 = dVar.b();
        if (b10 != null) {
            return b10.get(this.f4497b);
        }
        a();
        int i7 = this.f4498c;
        if (i7 == -1) {
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        return objArr[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        d dVar = this.d;
        Map b10 = dVar.b();
        Object obj2 = this.f4497b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i7 = this.f4498c;
        if (i7 == -1) {
            dVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        Object obj3 = objArr[i7];
        objArr[i7] = obj;
        return obj3;
    }
}
