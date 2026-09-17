package ie;

import k1.a0;
import rd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f11988b;
    public final Object f11989c;

    public g(Object obj, int i10) {
        super(1);
        this.f11988b = i10;
        this.f11989c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f11988b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f11989c).b();
                return gd.i.f10616a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f11989c).f14460f.d(new k1.g(th3));
                }
                Object obj2 = a0.f14455s;
                a0 a0Var = (a0) this.f11989c;
                synchronized (obj2) {
                    a0.f14454r.remove(a0Var.b().getAbsolutePath());
                }
                return gd.i.f10616a;
        }
    }
}
