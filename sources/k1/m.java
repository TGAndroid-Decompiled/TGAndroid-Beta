package k1;

public final class m extends kotlin.jvm.internal.k implements ad.l {

    public final int f14276b;

    public final Object f14277c;

    public m(Object obj, int i10) {
        super(1);
        this.f14276b = i10;
        this.f14277c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14276b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((z) this.f14277c).f14335f.d(new g(th));
                }
                Object obj2 = z.f14330s;
                z zVar = (z) this.f14277c;
                synchronized (obj2) {
                    z.f14329r.remove(zVar.b().getAbsolutePath());
                }
                return pc.i.f45696a;
            default:
                ((rd.h) this.f14277c).b();
                return pc.i.f45696a;
        }
    }
}
