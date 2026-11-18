package c8;

import java.util.Map;
public final class c extends a8.g {
    public final Object f4501b;
    public int f4502c;
    public final d d;

    public c(d dVar, int i7) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f4527c;
        objArr.getClass();
        this.f4501b = objArr[i7];
        this.f4502c = i7;
    }

    public final void a() {
        int i7 = this.f4502c;
        Object obj = this.f4501b;
        d dVar = this.d;
        if (i7 != -1 && i7 < dVar.size()) {
            int i10 = this.f4502c;
            Object[] objArr = dVar.f4527c;
            objArr.getClass();
            if (a8.f8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = d.f4524s;
        this.f4502c = dVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f4501b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map b10 = dVar.b();
        if (b10 != null) {
            return b10.get(this.f4501b);
        }
        a();
        int i7 = this.f4502c;
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
        Object obj2 = this.f4501b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i7 = this.f4502c;
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
