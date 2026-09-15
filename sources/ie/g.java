package ie;

import k1.a0;
import rd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f11089b;
    public final Object f11090c;

    public g(Object obj, int i10) {
        super(1);
        this.f11089b = i10;
        this.f11090c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11089b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f11090c).b();
                return gd.i.f9616a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f11090c).f13151f.d(new k1.g(th3));
                }
                Object obj2 = a0.f13147s;
                a0 a0Var = (a0) this.f11090c;
                synchronized (obj2) {
                    a0.f13146r.remove(a0Var.b().getAbsolutePath());
                }
                return gd.i.f9616a;
        }
    }
}
