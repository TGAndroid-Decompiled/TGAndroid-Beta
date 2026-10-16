package k1;
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final int f13783b;
    public final Object f13784c;

    public m(Object obj, int i10) {
        super(1);
        this.f13783b = i10;
        this.f13784c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f13783b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f13784c).f13834f.d(new g(th2));
                }
                Object obj2 = z.f13830s;
                z zVar = (z) this.f13784c;
                synchronized (obj2) {
                    z.f13829r.remove(zVar.c().getAbsolutePath());
                }
                return id.i.f11390a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ke.h) this.f13784c).b();
                return id.i.f11390a;
        }
    }
}
