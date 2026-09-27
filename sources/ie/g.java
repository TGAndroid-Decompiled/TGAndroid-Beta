package ie;

import k1.a0;
import rd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f11082b;
    public final Object f11083c;

    public g(Object obj, int i10) {
        super(1);
        this.f11082b = i10;
        this.f11083c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11082b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f11083c).b();
                return gd.i.f9608a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f11083c).f13146f.d(new k1.g(th3));
                }
                Object obj2 = a0.f13142s;
                a0 a0Var = (a0) this.f11083c;
                synchronized (obj2) {
                    a0.f13141r.remove(a0Var.c().getAbsolutePath());
                }
                return gd.i.f9608a;
        }
    }
}
