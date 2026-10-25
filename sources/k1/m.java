package k1;
public final class m extends kotlin.jvm.internal.j implements ud.l {
    public final int f16061b;
    public final Object f16062c;

    public m(Object obj, int i10) {
        super(1);
        this.f16061b = i10;
        this.f16062c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f16061b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f16062c).f16112f.d(new g(th2));
                }
                Object obj2 = z.f16108s;
                z zVar = (z) this.f16062c;
                synchronized (obj2) {
                    z.f16107r.remove(zVar.b().getAbsolutePath());
                }
                return jd.i.f15580a;
            default:
                Throwable th3 = (Throwable) obj;
                ((le.h) this.f16062c).b();
                return jd.i.f15580a;
        }
    }
}
