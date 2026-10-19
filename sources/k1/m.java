package k1;
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final int f14584b;
    public final Object f14585c;

    public m(Object obj, int i10) {
        super(1);
        this.f14584b = i10;
        this.f14585c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14584b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f14585c).f14635f.d(new g(th2));
                }
                Object obj2 = z.f14631s;
                z zVar = (z) this.f14585c;
                synchronized (obj2) {
                    z.f14630r.remove(zVar.b().getAbsolutePath());
                }
                return id.i.f12777a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ke.h) this.f14585c).b();
                return id.i.f12777a;
        }
    }
}
