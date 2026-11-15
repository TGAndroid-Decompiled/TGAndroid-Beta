package jb;

import c8.ee;
import gb.h1;
public final class d implements q {
    public static final int f16963g;
    public static final xd.c h;
    public final h1 f16964a;
    public final va.d f16965b;
    public final gb.b f16966c;
    public final f d;
    public final p f16967e;
    public final ie.d f16968f;

    static {
        int i7 = yd.a.d;
        f16963g = (int) yd.a.d(ee.c(24, yd.c.f60613f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(h1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f16964a = timeProvider;
        this.f16965b = firebaseInstallationsApi;
        this.f16966c = appInfo;
        this.d = configsFetcher;
        this.f16967e = settingsCache;
        this.f16968f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f59880a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final Boolean a() {
        return this.f16967e.a().f16976a;
    }

    @Override
    public final java.lang.Object b(id.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b(id.c):java.lang.Object");
    }

    @Override
    public final yd.a c() {
        Integer num = this.f16967e.a().f16978c;
        if (num != null) {
            int i7 = yd.a.d;
            return new yd.a(ee.c(num.intValue(), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f16967e.a().f16977b;
    }
}
