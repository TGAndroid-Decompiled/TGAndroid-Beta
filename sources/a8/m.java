package a8;

import java.util.Map;
public final class m extends g {
    public final Object f536b;
    public int f537c;
    public final o d;

    public m(o oVar, int i7) {
        super(0, false);
        this.d = oVar;
        Object[] objArr = oVar.f555c;
        objArr.getClass();
        this.f536b = objArr[i7];
        this.f537c = i7;
    }

    public final void a() {
        int i7 = this.f537c;
        Object obj = this.f536b;
        o oVar = this.d;
        if (i7 != -1 && i7 < oVar.size()) {
            int i10 = this.f537c;
            Object[] objArr = oVar.f555c;
            objArr.getClass();
            if (w0.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = o.f552s;
        this.f537c = oVar.f(obj);
    }

    @Override
    public final Object getKey() {
        return this.f536b;
    }

    @Override
    public final Object getValue() {
        o oVar = this.d;
        Map b10 = oVar.b();
        if (b10 != null) {
            return b10.get(this.f536b);
        }
        a();
        int i7 = this.f537c;
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
        Object obj2 = this.f536b;
        if (b10 != null) {
            return b10.put(obj2, obj);
        }
        a();
        int i7 = this.f537c;
        if (i7 == -1) {
            oVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = oVar.d;
        objArr.getClass();
        Object obj3 = objArr[i7];
        int i10 = this.f537c;
        Object[] objArr2 = oVar.d;
        objArr2.getClass();
        objArr2[i10] = obj;
        return obj3;
    }
}
