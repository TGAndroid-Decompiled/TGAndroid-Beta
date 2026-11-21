package ie;

import gd.k;
import rd.q;
public final class b implements q {
    public final int f16252a;
    public final Object f16253b;

    public b(d dVar, c cVar) {
        this.f16252a = 0;
        this.f16253b = dVar;
    }

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f16252a) {
            case 0:
                d dVar = (d) this.f16253b;
                Throwable th2 = (Throwable) obj;
                k kVar = (k) obj2;
                id.h hVar = (id.h) obj3;
                d.f16256g.set(dVar, null);
                dVar.f(null);
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                k kVar2 = (k) obj2;
                id.h hVar2 = (id.h) obj3;
                ((h) this.f16253b).b();
                break;
            default:
                id.h hVar3 = (id.h) obj3;
                ((c1.c) this.f16253b).invoke((Throwable) obj);
                break;
        }
        return k.f13514a;
    }

    public b(Object obj, int i7) {
        this.f16252a = i7;
        this.f16253b = obj;
    }
}
