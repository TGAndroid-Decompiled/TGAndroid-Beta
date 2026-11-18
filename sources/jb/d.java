package jb;

import c8.he;
import gb.h1;
public final class d implements q {
    public static final int f17345g;
    public static final xd.c h;
    public final h1 f17346a;
    public final va.d f17347b;
    public final gb.b f17348c;
    public final f d;
    public final p f17349e;
    public final ie.d f17350f;

    static {
        int i7 = yd.a.d;
        f17345g = (int) yd.a.d(he.c(24, yd.c.f61179f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(h1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f17346a = timeProvider;
        this.f17347b = firebaseInstallationsApi;
        this.f17348c = appInfo;
        this.d = configsFetcher;
        this.f17349e = settingsCache;
        this.f17350f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f60450a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final Boolean a() {
        return this.f17349e.a().f17358a;
    }

    @Override
    public final java.lang.Object b(id.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b(id.c):java.lang.Object");
    }

    @Override
    public final yd.a c() {
        Integer num = this.f17349e.a().f17360c;
        if (num != null) {
            int i7 = yd.a.d;
            return new yd.a(he.c(num.intValue(), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f17349e.a().f17359b;
    }
}
