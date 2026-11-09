package jb;

import c8.ee;
import gb.j1;
public final class d implements q {
    public static final int f16610g;
    public static final xd.c h;
    public final j1 f16611a;
    public final va.d f16612b;
    public final gb.b f16613c;
    public final f d;
    public final p f16614e;
    public final ie.d f16615f;

    static {
        int i7 = yd.a.d;
        f16610g = (int) yd.a.d(ee.c(24, yd.c.f59408f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(j1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f16611a = timeProvider;
        this.f16612b = firebaseInstallationsApi;
        this.f16613c = appInfo;
        this.d = configsFetcher;
        this.f16614e = settingsCache;
        this.f16615f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f58698a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final Boolean a() {
        return this.f16614e.a().f16623a;
    }

    @Override
    public final java.lang.Object b(id.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b(id.c):java.lang.Object");
    }

    @Override
    public final yd.a c() {
        Integer num = this.f16614e.a().f16625c;
        if (num != null) {
            int i7 = yd.a.d;
            return new yd.a(ee.c(num.intValue(), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f16614e.a().f16624b;
    }
}
