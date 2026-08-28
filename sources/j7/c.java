package j7;

import java.util.Map;
public final class c extends h7.f {
    public final Object f13657b;
    public int f13658c;
    public final d d;

    public c(d dVar, int i9) {
        super(1, false);
        this.d = dVar;
        Object[] objArr = dVar.f13677c;
        objArr.getClass();
        this.f13657b = objArr[i9];
        this.f13658c = i9;
    }

    public final void a() {
        int i9 = this.f13658c;
        Object obj = this.f13657b;
        d dVar = this.d;
        if (i9 != -1 && i9 < dVar.size()) {
            int i10 = this.f13658c;
            Object[] objArr = dVar.f13677c;
            objArr.getClass();
            if (f7.x8.a(obj, objArr[i10])) {
                return;
            }
        }
        Object obj2 = d.f13674s;
        this.f13658c = dVar.e(obj);
    }

    @Override
    public final Object getKey() {
        return this.f13657b;
    }

    @Override
    public final Object getValue() {
        d dVar = this.d;
        Map a2 = dVar.a();
        if (a2 != null) {
            return a2.get(this.f13657b);
        }
        a();
        int i9 = this.f13658c;
        if (i9 == -1) {
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        return objArr[i9];
    }

    @Override
    public final Object setValue(Object obj) {
        d dVar = this.d;
        Map a2 = dVar.a();
        Object obj2 = this.f13657b;
        if (a2 != null) {
            return a2.put(obj2, obj);
        }
        a();
        int i9 = this.f13658c;
        if (i9 == -1) {
            dVar.put(obj2, obj);
            return null;
        }
        Object[] objArr = dVar.d;
        objArr.getClass();
        Object obj3 = objArr[i9];
        objArr[i9] = obj;
        return obj3;
    }
}
