package gb;

import b8.ad;
public final class g implements le.e {
    public static final g f12217a;
    private static final je.d descriptor;

    static {
        ?? obj = new Object();
        f12217a = obj;
        le.m mVar = new le.m("com.google.firebase.sessions.settings.SessionConfigs", obj, 5);
        mVar.k("sessionsEnabled", false);
        mVar.k("sessionSamplingRate", false);
        mVar.k("sessionTimeoutSeconds", false);
        mVar.k("cacheDurationSeconds", false);
        mVar.k("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        int i3 = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z10 = true;
        while (z10) {
            int d10 = c2.d(dVar);
            if (d10 != -1) {
                if (d10 != 0) {
                    if (d10 != 1) {
                        if (d10 != 2) {
                            if (d10 != 3) {
                                if (d10 == 4) {
                                    l10 = (Long) c2.j(dVar, 4, le.i.f18193a, l10);
                                    i3 |= 16;
                                } else {
                                    throw new he.d(d10);
                                }
                            } else {
                                num2 = (Integer) c2.j(dVar, 3, le.f.f18187a, num2);
                                i3 |= 8;
                            }
                        } else {
                            num = (Integer) c2.j(dVar, 2, le.f.f18187a, num);
                            i3 |= 4;
                        }
                    } else {
                        d = (Double) c2.j(dVar, 1, le.c.f18181a, d);
                        i3 |= 2;
                    }
                } else {
                    bool = (Boolean) c2.j(dVar, 0, le.a.f18179a, bool);
                    i3 |= 1;
                }
            } else {
                z10 = false;
            }
        }
        c2.p(dVar);
        return new i(i3, bool, d, num, num2, l10);
    }

    @Override
    public final he.a[] b() {
        he.a a10 = ad.a(le.a.f18179a);
        he.a a11 = ad.a(le.c.f18181a);
        le.f fVar = le.f.f18187a;
        return new he.a[]{a10, a11, ad.a(fVar), ad.a(fVar), ad.a(le.i.f18193a)};
    }

    @Override
    public final void c(ne.h hVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        a10.g(dVar, 0, le.a.f18179a, value.f12218a);
        a10.g(dVar, 1, le.c.f18181a, value.f12219b);
        le.f fVar = le.f.f18187a;
        a10.g(dVar, 2, fVar, value.f12220c);
        a10.g(dVar, 3, fVar, value.d);
        a10.g(dVar, 4, le.i.f18193a, value.f12221e);
        a10.l(dVar);
    }

    @Override
    public final je.d d() {
        return descriptor;
    }
}
