package db;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class p0 {
    public static final p0 f8714a = new Object();
    public static final hi.d f8715b;

    static {
        oa.d dVar = new oa.d();
        dVar.c(o0.class, g.f8658a);
        dVar.c(w0.class, h.f8662a);
        dVar.c(k.class, e.f8638a);
        dVar.c(b.class, d.f8625a);
        dVar.c(a.class, c.f8611a);
        dVar.c(e0.class, f.f8653a);
        dVar.d = true;
        f8715b = new hi.d(dVar, 19);
    }

    public static b a(n9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f20296a;
        kotlin.jvm.internal.j.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        hVar.a();
        String str3 = hVar.f20298c.f20310b;
        kotlin.jvm.internal.j.d(str3, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        x xVar = x.f8752b;
        kotlin.jvm.internal.j.b(packageName);
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str = str2;
        } else {
            str = str4;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
        hVar.a();
        e0 b10 = f0.b(context);
        hVar.a();
        return new b(str3, new a(packageName, str, str2, b10, f0.a(context)));
    }
}
