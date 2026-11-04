package b8;

import java.util.Map;
public final class e extends bh {
    public final Object f2555b;
    public int f2556c;
    public final g d;

    public e(g gVar, int i3) {
        super(0, false);
        this.d = gVar;
        Object[] objArr = gVar.f2614c;
        objArr.getClass();
        this.f2555b = objArr[i3];
        this.f2556c = i3;
    }

    public final void a() {
        int i3 = this.f2556c;
        Object obj = this.f2555b;
        g gVar = this.d;
        if (i3 != -1 && i3 < gVar.size()) {
            int i10 = this.f2556c;
            Object[] objArr = gVar.f2614c;
            objArr.getClass();
            if (m1.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = g.f2611s;
        this.f2556c = gVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f2555b;
    }

    @Override
    public final Object getValue() {
        g gVar = this.d;
        Map b10 = gVar.b();
        if (b10 != null) {
            return b10.get(this.f2555b);
        }
        a();
        int i3 = this.f2556c;
        if (i3 == -1) {
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        return objArr[i3];
    }

    @Override
    public final Object setValue(Object obj) {
        g gVar = this.d;
        Map b10 = gVar.b();
        Object obj2 = this.f2555b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i3 = this.f2556c;
        if (i3 == -1) {
            gVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = gVar.d;
        objArr.getClass();
        Object obj3 = objArr[i3];
        objArr[i3] = obj;
        return obj3;
    }
}
