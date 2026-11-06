package jb;

import c8.ee;
import gb.j1;
public final class d implements q {
    public static final int f16607g;
    public static final xd.c h;
    public final j1 f16608a;
    public final va.d f16609b;
    public final gb.b f16610c;
    public final f d;
    public final p f16611e;
    public final ie.d f16612f;

    static {
        int i7 = yd.a.d;
        f16607g = (int) yd.a.d(ee.c(24, yd.c.f59303f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(j1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f16608a = timeProvider;
        this.f16609b = firebaseInstallationsApi;
        this.f16610c = appInfo;
        this.d = configsFetcher;
        this.f16611e = settingsCache;
        this.f16612f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f58593a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final Boolean a() {
        return this.f16611e.a().f16620a;
    }

    @Override
    public final java.lang.Object b(id.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b(id.c):java.lang.Object");
    }

    @Override
    public final yd.a c() {
        Integer num = this.f16611e.a().f16622c;
        if (num != null) {
            int i7 = yd.a.d;
            return new yd.a(ee.c(num.intValue(), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f16611e.a().f16621b;
    }
}
