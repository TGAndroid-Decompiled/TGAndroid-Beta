package db;
public final class l0 implements le.e {
    public static final l0 f8700a;
    private static final je.d descriptor;

    static {
        ?? obj = new Object();
        f8700a = obj;
        le.m mVar = new le.m("com.google.firebase.sessions.SessionDetails", obj, 4);
        mVar.k("sessionId", false);
        mVar.k("firstSessionId", false);
        mVar.k("sessionIndex", false);
        mVar.k("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        int i3 = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        boolean z10 = true;
        while (z10) {
            int d = c2.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d != 1) {
                        if (d != 2) {
                            if (d == 3) {
                                j10 = c2.h(dVar, 3);
                                i3 |= 8;
                            } else {
                                throw new he.d(d);
                            }
                        } else {
                            i10 = c2.f(dVar, 2);
                            i3 |= 4;
                        }
                    } else {
                        str2 = c2.n(dVar, 1);
                        i3 |= 2;
                    }
                } else {
                    str = c2.n(dVar, 0);
                    i3 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c2.p(dVar);
        return new n0(i3, str, str2, i10, j10);
    }

    @Override
    public final he.a[] b() {
        le.p pVar = le.p.f18214a;
        return new he.a[]{pVar, pVar, le.f.f18187a, le.i.f18193a};
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        n0 value = (n0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        a10.k(dVar, 0, value.f8706a);
        a10.k(dVar, 1, value.f8707b);
        int i3 = value.f8708c;
        a10.b(dVar, 2);
        a10.c(i3);
        a10.e(dVar, 3, value.d);
        a10.l(dVar);
    }

    @Override
    public final je.d d() {
        return descriptor;
    }
}
