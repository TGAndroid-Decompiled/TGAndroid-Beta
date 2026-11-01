package ce;

import k1.z;
import ld.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f4131b;
    public final Object f4132c;

    public g(Object obj, int i10) {
        super(1);
        this.f4131b = i10;
        this.f4132c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f4131b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f4132c).b();
                return ad.j.f401a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((z) this.f4132c).f10591f.d(new k1.g(th3));
                }
                Object obj2 = z.f10587s;
                z zVar = (z) this.f4132c;
                synchronized (obj2) {
                    z.f10586r.remove(zVar.b().getAbsolutePath());
                }
                return ad.j.f401a;
        }
    }
}
