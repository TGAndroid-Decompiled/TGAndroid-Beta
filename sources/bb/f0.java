package bb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class f0 {
    public static final f0 f2555a = new Object();
    public static final a4.l f2556b;

    static {
        la.d dVar = new la.d();
        dVar.e(e0.class, g.f2557a);
        dVar.e(n0.class, h.f2560a);
        dVar.e(j.class, e.f2547a);
        dVar.e(b.class, d.f2539a);
        dVar.e(a.class, c.f2530a);
        dVar.e(q.class, f.f2552a);
        dVar.d = true;
        f2556b = new a4.l(dVar, 26);
    }

    public static b a(l9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f11708a;
        kotlin.jvm.internal.i.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        hVar.a();
        String str3 = hVar.f11710c.f11719b;
        kotlin.jvm.internal.i.d(str3, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.i.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.i.d(packageName, "packageName");
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str = str2;
        } else {
            str = str4;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.i.d(MANUFACTURER, "MANUFACTURER");
        hVar.a();
        q b10 = r.b(context);
        hVar.a();
        return new b(str3, new a(packageName, str, str2, b10, r.a(context)));
    }
}
