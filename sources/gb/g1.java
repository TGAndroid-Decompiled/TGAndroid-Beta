package gb;
public final class g1 implements oe.e {
    public static final g1 f13688a;
    private static final me.d descriptor;

    static {
        ?? obj = new Object();
        f13688a = obj;
        oe.m mVar = new oe.m("com.google.firebase.sessions.Time", obj, 3);
        mVar.k("ms", false);
        mVar.k("us", true);
        mVar.k("seconds", true);
        descriptor = mVar;
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        i1 value = (i1) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        long j3 = value.f13711a;
        long j10 = value.f13713c;
        long j11 = value.f13712b;
        a10.e(dVar, 0, j3);
        if (a10.p(dVar) || j11 != 1000 * j3) {
            a10.e(dVar, 1, j11);
        }
        if (a10.p(dVar) || j10 != j3 / 1000) {
            a10.e(dVar, 2, j10);
        }
        a10.l(dVar);
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        int i7 = 0;
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        boolean z9 = true;
        while (z9) {
            int d = c10.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d != 1) {
                        if (d == 2) {
                            j11 = c10.h(dVar, 2);
                            i7 |= 4;
                        } else {
                            throw new ke.d(d);
                        }
                    } else {
                        j10 = c10.h(dVar, 1);
                        i7 |= 2;
                    }
                } else {
                    j3 = c10.h(dVar, 0);
                    i7 |= 1;
                }
            } else {
                z9 = false;
            }
        }
        c10.p(dVar);
        return new i1(i7, j3, j10, j11);
    }

    @Override
    public final ke.a[] c() {
        oe.i iVar = oe.i.f20915a;
        return new ke.a[]{iVar, iVar, iVar};
    }

    @Override
    public final me.d d() {
        return descriptor;
    }
}
