package je;

import k1.a0;
import sd.l;
public final class g extends kotlin.jvm.internal.j implements l {
    public final int f14134b;
    public final Object f14135c;

    public g(Object obj, int i10) {
        super(1);
        this.f14134b = i10;
        this.f14135c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14134b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((i) this.f14135c).b();
                return hd.i.f11090a;
            default:
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    ((a0) this.f14135c).f14324f.d(new k1.g(th3));
                }
                Object obj2 = a0.f14319s;
                a0 a0Var = (a0) this.f14135c;
                synchronized (obj2) {
                    a0.f14318r.remove(a0Var.c().getAbsolutePath());
                }
                return hd.i.f11090a;
        }
    }
}
