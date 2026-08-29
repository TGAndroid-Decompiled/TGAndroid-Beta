package l7;

import java.util.Map;
public final class c extends j7.f {
    public final Object f14516b;
    public int f14517c;
    public final d d;

    public c(d dVar, int i10) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f14536c;
        objArr.getClass();
        this.f14516b = objArr[i10];
        this.f14517c = i10;
    }

    public final void a() {
        int i10 = this.f14517c;
        Object obj = this.f14516b;
        d dVar = this.d;
        if (i10 != -1 && i10 < dVar.size()) {
            int i11 = this.f14517c;
            Object[] objArr = dVar.f14536c;
            objArr.getClass();
            if (i7.q.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = d.f14533s;
        this.f14517c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f14516b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f14516b);
        }
        a();
        int i10 = this.f14517c;
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
        Object obj2 = this.f14516b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f14517c;
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
