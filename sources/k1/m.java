package k1;
public final class m extends kotlin.jvm.internal.j implements zc.l {
    public final int f14455b;
    public final Object f14456c;

    public m(Object obj, int i9) {
        super(1);
        this.f14455b = i9;
        this.f14456c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f14455b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((z) this.f14456c).f14514f.d(new g(th));
                }
                Object obj2 = z.f14509s;
                z zVar = (z) this.f14456c;
                synchronized (obj2) {
                    z.f14508r.remove(zVar.b().getAbsolutePath());
                }
                return oc.i.f19197a;
            default:
                Throwable th2 = (Throwable) obj;
                ((qd.h) this.f14456c).b();
                return oc.i.f19197a;
        }
    }
}
