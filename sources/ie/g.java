package ie;

import k1.a0;
import rd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f12067b;
    public final Object f12068c;

    public g(Object obj, int i10) {
        super(1);
        this.f12067b = i10;
        this.f12068c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f12067b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f12068c).b();
                return gd.i.f10453a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f12068c).f14291f.e(new k1.g(th3));
                }
                Object obj2 = a0.f14286s;
                a0 a0Var = (a0) this.f12068c;
                synchronized (obj2) {
                    a0.f14285r.remove(a0Var.b().getAbsolutePath());
                }
                return gd.i.f10453a;
        }
    }
}
