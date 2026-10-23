package k1;
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final int f14628b;
    public final Object f14629c;

    public m(Object obj, int i10) {
        super(1);
        this.f14628b = i10;
        this.f14629c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14628b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f14629c).f14679f.d(new g(th2));
                }
                Object obj2 = z.f14675s;
                z zVar = (z) this.f14629c;
                synchronized (obj2) {
                    z.f14674r.remove(zVar.c().getAbsolutePath());
                }
                return id.i.f12807a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ke.h) this.f14629c).b();
                return id.i.f12807a;
        }
    }
}
