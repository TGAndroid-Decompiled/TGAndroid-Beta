package gb;

import db.i1;
import x7.m5;
public final class d implements q {
    public static final int f12205g;
    public static final ud.c h;
    public final i1 f12206a;
    public final ua.e f12207b;
    public final db.b f12208c;
    public final f d;
    public final p f12209e;
    public final fe.d f12210f;

    static {
        int i3 = vd.a.d;
        f12205g = (int) vd.a.d(m5.c(24, vd.c.f56563f), vd.c.d);
        h = new ud.c("com/google/firebase/sessions//");
    }

    public d(i1 timeProvider, ua.e firebaseInstallationsApi, db.b appInfo, f configsFetcher, p settingsCache) {
        kotlin.jvm.internal.j.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.j.e(appInfo, "appInfo");
        kotlin.jvm.internal.j.e(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.j.e(settingsCache, "settingsCache");
        this.f12206a = timeProvider;
        this.f12207b = firebaseInstallationsApi;
        this.f12208c = appInfo;
        this.d = configsFetcher;
        this.f12209e = settingsCache;
        this.f12210f = new fe.d();
    }

    public static String e(String input) {
        ud.c cVar = h;
        cVar.getClass();
        kotlin.jvm.internal.j.e(input, "input");
        String replaceAll = cVar.f55812a.matcher(input).replaceAll("");
        kotlin.jvm.internal.j.d(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @Override
    public final java.lang.Object a(fd.c r24) {
        throw new UnsupportedOperationException("Method not decompiled: gb.d.a(fd.c):java.lang.Object");
    }

    @Override
    public final Boolean b() {
        return this.f12209e.a().f12218a;
    }

    @Override
    public final vd.a c() {
        Integer num = this.f12209e.a().f12220c;
        if (num != null) {
            int i3 = vd.a.d;
            return new vd.a(m5.c(num.intValue(), vd.c.d));
        }
        return null;
    }

    @Override
    public final Double d() {
        return this.f12209e.a().f12219b;
    }
}
