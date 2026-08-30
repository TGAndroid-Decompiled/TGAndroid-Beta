package k1;
public final class o extends kotlin.jvm.internal.k implements dd.l {
    public final int f9589b;
    public final Object f9590c;

    public o(Object obj, int i10) {
        super(1);
        this.f9589b = i10;
        this.f9590c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f9589b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((d0) this.f9590c).f9572f.d(new h(th2));
                }
                Object obj2 = d0.f9568s;
                d0 d0Var = (d0) this.f9590c;
                synchronized (obj2) {
                    d0.f9567r.remove(d0Var.b().getAbsolutePath());
                }
                return sc.i.f44253a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ud.h) this.f9590c).b();
                return sc.i.f44253a;
        }
    }
}
