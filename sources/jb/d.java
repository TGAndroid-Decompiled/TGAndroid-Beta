package jb;

import c8.ie;
import gb.i1;
public final class d implements r {
    public static final int f17439g;
    public static final xd.c h;
    public final i1 f17440a;
    public final va.d f17441b;
    public final gb.b f17442c;
    public final f d;
    public final q f17443e;
    public final ie.d f17444f;

    static {
        int i7 = yd.a.d;
        f17439g = (int) yd.a.d(ie.c(24, yd.c.f61308f), yd.c.d);
        h = new xd.c("com/google/firebase/sessions//");
    }

    public d(i1 timeProvider, va.d firebaseInstallationsApi, gb.b appInfo, f configsFetcher, q settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f17440a = timeProvider;
        this.f17441b = firebaseInstallationsApi;
        this.f17442c = appInfo;
        this.d = configsFetcher;
        this.f17443e = settingsCache;
        this.f17444f = new ie.d();
    }

    public static String e(String input) {
        xd.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f60578a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final Boolean a() {
        return this.f17443e.a().f17452a;
    }

    @Override
    public final java.lang.Object b(id.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: jb.d.b(id.c):java.lang.Object");
    }

    @Override
    public final yd.a c() {
        Integer num = this.f17443e.a().f17454c;
        if (num != null) {
            int i7 = yd.a.d;
            return new yd.a(ie.c(num.intValue(), yd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f17443e.a().f17453b;
    }
}
