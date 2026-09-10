package ie;

import k1.a0;
import rd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f10573b;
    public final Object f10574c;

    public g(Object obj, int i10) {
        super(1);
        this.f10573b = i10;
        this.f10574c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f10573b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f10574c).b();
                return gd.i.f8748a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f10574c).f11998f.d(new k1.g(th3));
                }
                Object obj2 = a0.f11994s;
                a0 a0Var = (a0) this.f10574c;
                synchronized (obj2) {
                    a0.f11993r.remove(a0Var.b().getAbsolutePath());
                }
                return gd.i.f8748a;
        }
    }
}
