package k1;
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final int f13780b;
    public final Object f13781c;

    public m(Object obj, int i10) {
        super(1);
        this.f13780b = i10;
        this.f13781c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f13780b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f13781c).f13831f.d(new g(th2));
                }
                Object obj2 = z.f13827s;
                z zVar = (z) this.f13781c;
                synchronized (obj2) {
                    z.f13826r.remove(zVar.c().getAbsolutePath());
                }
                return id.i.f11386a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ke.h) this.f13781c).b();
                return id.i.f11386a;
        }
    }
}
