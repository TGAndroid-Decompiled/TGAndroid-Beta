package jb;

import c8.k1;
public final class g implements oe.e {
    public static final g f16619a;
    private static final me.d descriptor;

    static {
        ?? obj = new Object();
        f16619a = obj;
        oe.m mVar = new oe.m("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        mVar.k("sessionsEnabled", false);
        mVar.k("sessionSamplingRate", false);
        mVar.k("sessionTimeoutSeconds", false);
        mVar.k("cacheDurationSeconds", false);
        mVar.k("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override
    public final void a(qe.h hVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        a10.g(dVar, 0, oe.a.f20898a, value.f16620a);
        a10.g(dVar, 1, oe.c.f20900a, value.f16621b);
        oe.f fVar = oe.f.f20906a;
        a10.g(dVar, 2, fVar, value.f16622c);
        a10.g(dVar, 3, fVar, value.d);
        a10.g(dVar, 4, oe.i.f20912a, value.f16623e);
        a10.l(dVar);
    }

    @Override
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        int i7 = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z9 = true;
        while (z9) {
            int d2 = c10.d(dVar);
            if (d2 != -1) {
                if (d2 != 0) {
                    if (d2 != 1) {
                        if (d2 != 2) {
                            if (d2 != 3) {
                                if (d2 == 4) {
                                    l10 = (Long) c10.j(dVar, 4, oe.i.f20912a, l10);
                                    i7 |= 16;
                                } else {
                                    throw new ke.d(d2);
                                }
                            } else {
                                num2 = (Integer) c10.j(dVar, 3, oe.f.f20906a, num2);
                                i7 |= 8;
                            }
                        } else {
                            num = (Integer) c10.j(dVar, 2, oe.f.f20906a, num);
                            i7 |= 4;
                        }
                    } else {
                        d = (Double) c10.j(dVar, 1, oe.c.f20900a, d);
                        i7 |= 2;
                    }
                } else {
                    bool = (Boolean) c10.j(dVar, 0, oe.a.f20898a, bool);
                    i7 |= 1;
                }
            } else {
                z9 = false;
            }
        }
        c10.p(dVar);
        return new i(i7, bool, d, num, num2, l10);
    }

    @Override
    public final ke.a[] c() {
        ke.a a10 = k1.a(oe.a.f20898a);
        ke.a a11 = k1.a(oe.c.f20900a);
        oe.f fVar = oe.f.f20906a;
        return new ke.a[]{a10, a11, k1.a(fVar), k1.a(fVar), k1.a(oe.i.f20912a)};
    }

    @Override
    public final me.d d() {
        return descriptor;
    }
}
