package h7;

import java.util.Map;
public final class l extends f {
    public final Object f10007b;
    public int f10008c;
    public final n d;

    public l(n nVar, int i9) {
        super(0, false);
        this.d = nVar;
        Object[] objArr = nVar.f10034c;
        objArr.getClass();
        this.f10007b = objArr[i9];
        this.f10008c = i9;
    }

    public final void a() {
        int i9 = this.f10008c;
        Object obj = this.f10007b;
        n nVar = this.d;
        if (i9 != -1 && i9 < nVar.size()) {
            int i10 = this.f10008c;
            Object[] objArr = nVar.f10034c;
            objArr.getClass();
            if (f7.a8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = n.f10031s;
        this.f10008c = nVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f10007b;
    }

    @Override
    public final Object getValue() {
        n nVar = this.d;
        Map a2 = nVar.a();
        if (a2 != null) {
            return a2.get(this.f10007b);
        }
        a();
        int i9 = this.f10008c;
        if (i9 == -1) {
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        return objArr[i9];
    }

    @Override
    public final Object setValue(Object obj) {
        n nVar = this.d;
        Map a2 = nVar.a();
        Object obj2 = this.f10007b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i9 = this.f10008c;
        if (i9 == -1) {
            nVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        Object obj3 = objArr[i9];
        int i10 = this.f10008c;
        Object[] objArr2 = nVar.d;
        objArr2.getClass();
        objArr2[i10] = obj;
        return obj3;
    }
}
