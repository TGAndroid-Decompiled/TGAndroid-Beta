package a8;

import java.util.Map;
public final class e extends eh {
    public final Object f414b;
    public int f415c;
    public final g d;

    public e(g gVar, int i10) {
        super(0, false);
        this.d = gVar;
        Object[] objArr = gVar.f471c;
        objArr.getClass();
        this.f414b = objArr[i10];
        this.f415c = i10;
    }

    public final void a() {
        int i10 = this.f415c;
        Object obj = this.f414b;
        g gVar = this.d;
        if (i10 != -1 && i10 < gVar.size()) {
            int i11 = this.f415c;
            Object[] objArr = gVar.f471c;
            objArr.getClass();
            if (n0.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = g.f468s;
        this.f415c = gVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f414b;
    }

    @Override
    public final Object getValue() {
        g gVar = this.d;
        Map a2 = gVar.a();
        if (a2 != null) {
            return a2.get(this.f414b);
        }
        a();
        int i10 = this.f415c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        g gVar = this.d;
        Map a2 = gVar.a();
        Object obj2 = this.f414b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f415c;
        if (i10 == -1) {
            gVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        objArr[i10] = obj;
        return obj3;
    }
}
