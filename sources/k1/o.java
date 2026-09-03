package k1;
public final class o extends kotlin.jvm.internal.k implements dd.l {
    public final int f10294b;
    public final Object f10295c;

    public o(Object obj, int i10) {
        super(1);
        this.f10294b = i10;
        this.f10295c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f10294b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((d0) this.f10295c).f10276f.d(new h(th2));
                }
                Object obj2 = d0.f10271s;
                d0 d0Var = (d0) this.f10295c;
                synchronized (obj2) {
                    d0.f10270r.remove(d0Var.b().getAbsolutePath());
                }
                return sc.i.f47274a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ud.h) this.f10295c).b();
                return sc.i.f47274a;
        }
    }
}
