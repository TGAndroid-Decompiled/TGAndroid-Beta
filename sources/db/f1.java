package db;
public final class f1 implements le.e {
    public static final f1 f8657a;
    private static final je.d descriptor;

    static {
        ?? obj = new Object();
        f8657a = obj;
        le.m mVar = new le.m("com.google.firebase.sessions.Time", obj, 3);
        mVar.k("ms", false);
        mVar.k("us", true);
        mVar.k("seconds", true);
        descriptor = mVar;
    }

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        int i3 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        boolean z10 = true;
        while (z10) {
            int d = c2.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d != 1) {
                        if (d == 2) {
                            j12 = c2.h(dVar, 2);
                            i3 |= 4;
                        } else {
                            throw new he.d(d);
                        }
                    } else {
                        j11 = c2.h(dVar, 1);
                        i3 |= 2;
                    }
                } else {
                    j10 = c2.h(dVar, 0);
                    i3 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c2.p(dVar);
        return new h1(i3, j10, j11, j12);
    }

    @Override
    public final he.a[] b() {
        le.i iVar = le.i.f18193a;
        return new he.a[]{iVar, iVar, iVar};
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        h1 value = (h1) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        long j10 = value.f8669a;
        long j11 = value.f8671c;
        long j12 = value.f8670b;
        a10.e(dVar, 0, j10);
        if (a10.p(dVar) || j12 != 1000 * j10) {
            a10.e(dVar, 1, j12);
        }
        if (a10.p(dVar) || j11 != j10 / 1000) {
            a10.e(dVar, 2, j11);
        }
        a10.l(dVar);
    }

    @Override
    public final je.d d() {
        return descriptor;
    }
}
