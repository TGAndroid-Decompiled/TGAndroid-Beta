package k1;
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final int f14585b;
    public final Object f14586c;

    public m(Object obj, int i10) {
        super(1);
        this.f14585b = i10;
        this.f14586c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14585b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f14586c).f14636f.d(new g(th2));
                }
                Object obj2 = z.f14632s;
                z zVar = (z) this.f14586c;
                synchronized (obj2) {
                    z.f14631r.remove(zVar.c().getAbsolutePath());
                }
                return id.i.f12777a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ke.h) this.f14586c).b();
                return id.i.f12777a;
        }
    }
}
