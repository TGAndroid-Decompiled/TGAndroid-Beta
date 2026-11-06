package a8;

import java.util.Map;
public final class m extends g {
    public final Object f530b;
    public int f531c;
    public final o d;

    public m(o oVar, int i7) {
        super(0, false);
        this.d = oVar;
        Object[] objArr = oVar.f550c;
        objArr.getClass();
        this.f530b = objArr[i7];
        this.f531c = i7;
    }

    public final void a() {
        int i7 = this.f531c;
        Object obj = this.f530b;
        o oVar = this.d;
        if (i7 != -1 && i7 < oVar.size()) {
            int i10 = this.f531c;
            Object[] objArr = oVar.f550c;
            objArr.getClass();
            if (w0.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = o.f547s;
        this.f531c = oVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f530b;
    }

    @Override
    public final Object getValue() {
        o oVar = this.d;
        Map b10 = oVar.b();
        if (b10 != null) {
            return b10.get(this.f530b);
        }
        a();
        int i7 = this.f531c;
        if (i7 == -1) {
            return null;
        }
        Object[] objArr = oVar.d;
        objArr.getClass();
        return objArr[i7];
    }

    @Override
    public final Object setValue(Object obj) {
        o oVar = this.d;
        Map b10 = oVar.b();
        Object obj2 = this.f530b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i7 = this.f531c;
        if (i7 == -1) {
            oVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = oVar.d;
        objArr.getClass();
        Object obj3 = objArr[i7];
        int i10 = this.f531c;
        Object[] objArr2 = oVar.d;
        objArr2.getClass();
        objArr2[i10] = obj;
        return obj3;
    }
}
