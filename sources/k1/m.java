package k1;
public final class m extends kotlin.jvm.internal.j implements td.l {
    public final int f14583b;
    public final Object f14584c;

    public m(Object obj, int i10) {
        super(1);
        this.f14583b = i10;
        this.f14584c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14583b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    ((z) this.f14584c).f14634f.d(new g(th2));
                }
                Object obj2 = z.f14630s;
                z zVar = (z) this.f14584c;
                synchronized (obj2) {
                    z.f14629r.remove(zVar.c().getAbsolutePath());
                }
                return id.i.f12775a;
            default:
                Throwable th3 = (Throwable) obj;
                ((ke.h) this.f14584c).b();
                return id.i.f12775a;
        }
    }
}
