package jb;

import c8.he;
import gb.h1;
public final class d implements q {
    public static final int f17348g;
    public static final xd.c h;
    public final h1 f17349a;
    public final va.d f17350b;
    public final gb.b f17351c;
    public final f d;
    public final p f17352e;
    public final ie.d f17353f;

    static {
        int i7 = yd.a.d;
        f17348g = (int) yd.a.d(he.c(24, yd.c.f61178f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(h1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f17349a = timeProvider;
        this.f17350b = firebaseInstallationsApi;
        this.f17351c = appInfo;
        this.d = configsFetcher;
        this.f17352e = settingsCache;
        this.f17353f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f60449a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final Boolean a() {
        return this.f17352e.a().f17361a;
    }

    @Override
    public final java.lang.Object b(id.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b(id.c):java.lang.Object");
    }

    @Override
    public final yd.a c() {
        Integer num = this.f17352e.a().f17363c;
        if (num != null) {
            int i7 = yd.a.d;
            return new yd.a(he.c(num.intValue(), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f17352e.a().f17362b;
    }
}
