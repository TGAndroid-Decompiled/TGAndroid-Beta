package k1;
public final class m extends kotlin.jvm.internal.j implements ud.l {
    public final int f16060b;
    public final Object f16061c;

    public m(Object obj, int i10) {
        super(1);
        this.f16060b = i10;
        this.f16061c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f16060b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f16061c).f16111f.d(new g(th2));
                }
                Object obj2 = z.f16107s;
                z zVar = (z) this.f16061c;
                synchronized (obj2) {
                    z.f16106r.remove(zVar.b().getAbsolutePath());
                }
                return jd.i.f15579a;
            default:
                Throwable th3 = (Throwable) obj;
                ((le.h) this.f16061c).b();
                return jd.i.f15579a;
        }
    }
}
