package je;

import k1.a0;
import sd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f14136b;
    public final Object f14137c;

    public g(Object obj, int i10) {
        super(1);
        this.f14136b = i10;
        this.f14137c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14136b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f14137c).b();
                return hd.i.f11091a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f14137c).f14326f.d(new k1.g(th3));
                }
                Object obj2 = a0.f14321s;
                a0 a0Var = (a0) this.f14137c;
                synchronized (obj2) {
                    a0.f14320r.remove(a0Var.b().getAbsolutePath());
                }
                return hd.i.f11091a;
        }
    }
}
