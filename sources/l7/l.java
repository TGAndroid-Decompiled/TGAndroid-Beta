package l7;

import java.util.Map;
public final class l extends f {
    public final Object f11524b;
    public int f11525c;
    public final n d;

    public l(n nVar, int i10) {
        super(0, false);
        this.d = nVar;
        Object[] objArr = nVar.f11563c;
        objArr.getClass();
        this.f11524b = objArr[i10];
        this.f11525c = i10;
    }

    public final void a() {
        int i10 = this.f11525c;
        Object obj = this.f11524b;
        n nVar = this.d;
        if (i10 != -1 && i10 < nVar.size()) {
            int i11 = this.f11525c;
            Object[] objArr = nVar.f11563c;
            objArr.getClass();
            if (k7.i.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = n.f11560s;
        this.f11525c = nVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f11524b;
    }

    @Override
    public final Object getValue() {
        n nVar = this.d;
        Map a2 = nVar.a();
        if (a2 != null) {
            return a2.get(this.f11524b);
        }
        a();
        int i10 = this.f11525c;
        if (i10 == -1) {
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        return objArr[i10];
    }

    @Override
    public final Object setValue(Object obj) {
        n nVar = this.d;
        Map a2 = nVar.a();
        Object obj2 = this.f11524b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i10 = this.f11525c;
        if (i10 == -1) {
            nVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f11525c;
        Object[] objArr2 = nVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
