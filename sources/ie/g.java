package ie;

import k1.a0;
import rd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f11092b;
    public final Object f11093c;

    public g(Object obj, int i10) {
        super(1);
        this.f11092b = i10;
        this.f11093c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11092b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f11093c).b();
                return gd.i.f9621a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f11093c).f13154f.d(new k1.g(th3));
                }
                Object obj2 = a0.f13150s;
                a0 a0Var = (a0) this.f11093c;
                synchronized (obj2) {
                    a0.f13149r.remove(a0Var.b().getAbsolutePath());
                }
                return gd.i.f9621a;
        }
    }
}
