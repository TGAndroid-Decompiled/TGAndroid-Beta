package ie;

import gd.k;
import rd.q;
public final class b implements q {
    public final int f15459a;
    public final Object f15460b;

    public b(d dVar, c cVar) {
        this.f15459a = 0;
        this.f15460b = dVar;
    }

    @Override
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f15459a) {
            case 0:
                d dVar = (d) this.f15460b;
                Throwable th2 = (Throwable) obj;
                k kVar = (k) obj2;
                id.h hVar = (id.h) obj3;
                d.f15463g.set(dVar, null);
                dVar.f(null);
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                k kVar2 = (k) obj2;
                id.h hVar2 = (id.h) obj3;
                ((h) this.f15460b).b();
                break;
            default:
                id.h hVar3 = (id.h) obj3;
                ((c1.b) this.f15460b).invoke((Throwable) obj);
                break;
        }
        return k.f13831a;
    }

    public b(Object obj, int i7) {
        this.f15459a = i7;
        this.f15460b = obj;
    }
}
