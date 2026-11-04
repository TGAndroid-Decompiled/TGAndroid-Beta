package fe;

import dd.k;
import od.q;
public final class b implements q {
    public final int f11568a;
    public final Object f11569b;

    public b(d dVar, c cVar) {
        this.f11568a = 0;
        this.f11569b = dVar;
    }

    @Override
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f11568a) {
            case 0:
                d dVar = (d) this.f11569b;
                Throwable th2 = (Throwable) obj;
                k kVar = (k) obj2;
                fd.h hVar = (fd.h) obj3;
                d.f11572g.set(dVar, null);
                dVar.f(null);
                break;
            case 1:
                Throwable th3 = (Throwable) obj;
                k kVar2 = (k) obj2;
                fd.h hVar2 = (fd.h) obj3;
                ((h) this.f11569b).b();
                break;
            default:
                fd.h hVar3 = (fd.h) obj3;
                ((c1.b) this.f11569b).invoke((Throwable) obj);
                break;
        }
        return k.f8801a;
    }

    public b(Object obj, int i3) {
        this.f11568a = i3;
        this.f11569b = obj;
    }
}
