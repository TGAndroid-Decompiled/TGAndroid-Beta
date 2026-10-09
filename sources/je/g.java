package je;

import k1.a0;
import sd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f14137b;
    public final Object f14138c;

    public g(Object obj, int i10) {
        super(1);
        this.f14137b = i10;
        this.f14138c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14137b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f14138c).b();
                return hd.i.f11092a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f14138c).f14327f.d(new k1.g(th3));
                }
                Object obj2 = a0.f14322s;
                a0 a0Var = (a0) this.f14138c;
                synchronized (obj2) {
                    a0.f14321r.remove(a0Var.b().getAbsolutePath());
                }
                return hd.i.f11092a;
        }
    }
}
