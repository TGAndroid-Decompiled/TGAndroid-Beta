package jb;

import c8.he;
import gb.h1;
public final class d implements q {
    public static final int f17373g;
    public static final xd.c h;
    public final h1 f17374a;
    public final va.d f17375b;
    public final gb.b f17376c;
    public final f d;
    public final p f17377e;
    public final ie.d f17378f;

    static {
        int i7 = yd.a.d;
        f17373g = (int) yd.a.d(he.c(24, yd.c.f61224f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(h1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f17374a = timeProvider;
        this.f17375b = firebaseInstallationsApi;
        this.f17376c = appInfo;
        this.d = configsFetcher;
        this.f17377e = settingsCache;
        this.f17378f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f60495a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final Boolean a() {
        return this.f17377e.a().f17386a;
    }

    @Override
    public final java.lang.Object b(id.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b(id.c):java.lang.Object");
    }

    @Override
    public final yd.a c() {
        Integer num = this.f17377e.a().f17388c;
        if (num != null) {
            int i7 = yd.a.d;
            return new yd.a(he.c(num.intValue(), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f17377e.a().f17387b;
    }
}
