package gb;
public final class z implements oe.e {
    public static final z f13788a;
    private static final me.d descriptor;

    static {
        ?? obj = new Object();
        f13788a = obj;
        oe.m mVar = new oe.m("com.google.firebase.sessions.ProcessData", obj, 2);
        mVar.k("pid", false);
        mVar.k("uuid", false);
        descriptor = mVar;
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        b0 value = (b0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        int i7 = value.f13631a;
        a10.b(dVar, 0);
        a10.c(i7);
        a10.k(dVar, 1, value.f13632b);
        a10.l(dVar);
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        String str = null;
        boolean z9 = true;
        int i7 = 0;
        int i10 = 0;
        while (z9) {
            int d = c10.d(dVar);
            if (d != -1) {
                if (d != 0) {
                    if (d == 1) {
                        str = c10.n(dVar, 1);
                        i7 |= 2;
                    } else {
                        throw new ke.d(d);
                    }
                } else {
                    i10 = c10.f(dVar, 0);
                    i7 |= 1;
                }
            } else {
                z9 = false;
            }
        }
        c10.p(dVar);
        return new b0(i7, i10, str);
    }

    @Override
    public final ke.a[] c() {
        return new ke.a[]{oe.f.f20914a, oe.p.f20941a};
    }

    @Override
    public final me.d d() {
        return descriptor;
    }
}
