package k1;
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final int f14582b;
    public final Object f14583c;

    public m(Object obj, int i10) {
        super(1);
        this.f14582b = i10;
        this.f14583c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14582b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f14583c).f14633f.d(new g(th2));
                }
                Object obj2 = z.f14629s;
                z zVar = (z) this.f14583c;
                synchronized (obj2) {
                    z.f14628r.remove(zVar.b().getAbsolutePath());
                }
                return id.i.f12775a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ke.h) this.f14583c).b();
                return id.i.f12775a;
        }
    }
}
