package db;
public final class y implements le.e {
    public static final y f8756a;
    private static final je.d descriptor;

    static {
        ?? obj = new Object();
        f8756a = obj;
        le.m mVar = new le.m("com.google.firebase.sessions.ProcessData", obj, 2);
        mVar.k("pid", false);
        mVar.k("uuid", false);
        descriptor = mVar;
    }

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        String str = null;
        boolean z10 = true;
        int i3 = 0;
        int i10 = 0;
        while (z10) {
            int d = c2.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d == 1) {
                        str = c2.n(dVar, 1);
                        i3 |= 2;
                    } else {
                        throw new he.d(d);
                    }
                } else {
                    i10 = c2.f(dVar, 0);
                    i3 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c2.p(dVar);
        return new a0(i3, i10, str);
    }

    @Override
    public final he.a[] b() {
        return new he.a[]{le.f.f18187a, le.p.f18214a};
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        a0 value = (a0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        int i3 = value.f8599a;
        a10.b(dVar, 0);
        a10.c(i3);
        a10.k(dVar, 1, value.f8600b);
        a10.l(dVar);
    }

    @Override
    public final je.d d() {
        return descriptor;
    }
}
