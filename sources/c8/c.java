package c8;

import java.util.Map;
public final class c extends a8.g {
    public final Object f5395b;
    public int f5396c;
    public final d d;

    public c(d dVar, int i7) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f5416c;
        objArr.getClass();
        this.f5395b = objArr[i7];
        this.f5396c = i7;
    }

    public final void a() {
        int i7 = this.f5396c;
        Object obj = this.f5395b;
        d dVar = this.d;
        if (i7 != -1 && i7 < dVar.size()) {
            int i10 = this.f5396c;
            Object[] objArr = dVar.f5416c;
            objArr.getClass();
            if (a8.e8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = d.f5413s;
        this.f5396c = dVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f5395b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map b10 = dVar.b();
        if (b10 != null) {
            return b10.get(this.f5395b);
        }
        a();
        int i7 = this.f5396c;
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
        Object obj2 = this.f5395b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i7 = this.f5396c;
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
