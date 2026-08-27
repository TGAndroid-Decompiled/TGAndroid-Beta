package ia;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

public final class g0 {

    public static final g0 f11012a = new g0();

    public static final n2.b0 f11013b;

    static {
        t9.d dVar = new t9.d();
        dVar.d(f0.class, g.f11009a);
        dVar.d(o0.class, h.f11014a);
        dVar.d(j.class, e.f10997a);
        dVar.d(b.class, d.f10986a);
        dVar.d(a.class, c.f10977a);
        dVar.d(r.class, f.f11003a);
        dVar.d = true;
        f11013b = new n2.b0(dVar, 22);
    }

    public static b a(t8.h hVar) {
        hVar.a();
        Context context = hVar.f48119a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        hVar.a();
        String str = hVar.f48121c.f48132b;
        kotlin.jvm.internal.j.d(str, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.j.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
        hVar.a();
        r rVarB = s.b(context);
        hVar.a();
        return new b(str, new a(packageName, str3, strValueOf, rVarB, s.a(context)));
    }
}
