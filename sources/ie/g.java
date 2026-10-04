package ie;

import k1.a0;
import rd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f12066b;
    public final Object f12067c;

    public g(Object obj, int i10) {
        super(1);
        this.f12066b = i10;
        this.f12067c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f12066b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f12067c).b();
                return gd.i.f10452a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f12067c).f14290f.e(new k1.g(th3));
                }
                Object obj2 = a0.f14285s;
                a0 a0Var = (a0) this.f12067c;
                synchronized (obj2) {
                    a0.f14284r.remove(a0Var.b().getAbsolutePath());
                }
                return gd.i.f10452a;
        }
    }
}
