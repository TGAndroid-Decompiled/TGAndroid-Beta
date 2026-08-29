package k1;
public final class n extends kotlin.jvm.internal.k implements bd.l {
    public final int f13275b;
    public final Object f13276c;

    public n(Object obj, int i10) {
        super(1);
        this.f13275b = i10;
        this.f13276c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f13275b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((a0) this.f13276c).f13252f.d(new g(th2));
                }
                Object obj2 = a0.f13247s;
                a0 a0Var = (a0) this.f13276c;
                synchronized (obj2) {
                    a0.f13246r.remove(a0Var.b().getAbsolutePath());
                }
                return qc.i.f46603a;
            default:
                Throwable th3 = (Throwable) obj;
                ((sd.h) this.f13276c).b();
                return qc.i.f46603a;
        }
    }
}
