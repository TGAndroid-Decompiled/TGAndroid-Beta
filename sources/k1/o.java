package k1;
public final class o extends kotlin.jvm.internal.k implements dd.l {
    public final int f9570b;
    public final Object f9571c;

    public o(Object obj, int i10) {
        super(1);
        this.f9570b = i10;
        this.f9571c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f9570b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((d0) this.f9571c).f9553f.d(new h(th2));
                }
                Object obj2 = d0.f9549s;
                d0 d0Var = (d0) this.f9571c;
                synchronized (obj2) {
                    d0.f9548r.remove(d0Var.b().getAbsolutePath());
                }
                return sc.i.f44318a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ud.h) this.f9571c).b();
                return sc.i.f44318a;
        }
    }
}
