package i7;

import java.util.Map;

public final class l extends f {

    public final Object f10716b;

    public int f10717c;
    public final n d;

    public l(n nVar, int i10) {
        super(0, false);
        this.d = nVar;
        Object[] objArr = nVar.f10743c;
        objArr.getClass();
        this.f10716b = objArr[i10];
        this.f10717c = i10;
    }

    public final void a() {
        int i10 = this.f10717c;
        Object obj = this.f10716b;
        n nVar = this.d;
        if (i10 != -1 && i10 < nVar.size()) {
            int i11 = this.f10717c;
            Object[] objArr = nVar.f10743c;
            objArr.getClass();
            if (g7.d8.a(obj, objArr[i11])) {
                return;
            }
        }
        Object obj2 = n.f10740s;
        this.f10717c = nVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f10716b;
    }

    @Override
    public final Object getValue() {
        n nVar = this.d;
        Map mapA = nVar.a();
        if (mapA != null) {
            return mapA.get(this.f10716b);
        }
        a();
        int i10 = this.f10717c;
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
        Map mapA = nVar.a();
        Object obj2 = this.f10716b;
        if (mapA != null) {
            return mapA.put(obj2, obj);
        }
        a();
        int i10 = this.f10717c;
        if (i10 == -1) {
            nVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = nVar.d;
        objArr.getClass();
        Object obj3 = objArr[i10];
        int i11 = this.f10717c;
        Object[] objArr2 = nVar.d;
        objArr2.getClass();
        objArr2[i11] = obj;
        return obj3;
    }
}
