package gb;
public final class l0 implements oe.e {
    public static final l0 f13410a;
    private static final me.d descriptor;

    static {
        ?? obj = new Object();
        f13410a = obj;
        oe.m mVar = new oe.m("com.google.firebase.sessions.SessionDetails", obj, 4);
        mVar.k("sessionId", false);
        mVar.k("firstSessionId", false);
        mVar.k("sessionIndex", false);
        mVar.k("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        n0 value = (n0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        a10.k(dVar, 0, value.f13416a);
        a10.k(dVar, 1, value.f13417b);
        int i7 = value.f13418c;
        a10.b(dVar, 2);
        a10.c(i7);
        a10.e(dVar, 3, value.d);
        a10.l(dVar);
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        int i7 = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
        long j3 = 0;
        boolean z10 = true;
        while (z10) {
            int d = c10.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d != 1) {
                        if (d != 2) {
                            if (d == 3) {
                                j3 = c10.h(dVar, 3);
                                i7 |= 8;
                            } else {
                                throw new ke.d(d);
                            }
                        } else {
                            i10 = c10.f(dVar, 2);
                            i7 |= 4;
                        }
                    } else {
                        str2 = c10.n(dVar, 1);
                        i7 |= 2;
                    }
                } else {
                    str = c10.n(dVar, 0);
                    i7 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c10.p(dVar);
        return new n0(i7, str, str2, i10, j3);
    }

    @Override
    public final ke.a[] c() {
        oe.p pVar = oe.p.f21847a;
        return new ke.a[]{pVar, pVar, oe.f.f21820a, oe.i.f21826a};
    }

    @Override
    public final me.d d() {
        return descriptor;
    }
}
