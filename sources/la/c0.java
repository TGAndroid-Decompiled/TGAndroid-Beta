package la;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import vh.p1;
public final class c0 {
    public static final c0 f11745a = new Object();
    public static final p1 f11746b;

    static {
        w9.d dVar = new w9.d();
        dVar.d(b0.class, g.f11768a);
        dVar.d(k0.class, h.f11774a);
        dVar.d(j.class, e.f11752a);
        dVar.d(b.class, d.f11747a);
        dVar.d(a.class, c.f11740a);
        dVar.d(p.class, f.f11758a);
        dVar.d = true;
        f11746b = new p1(dVar);
    }

    public static b a(w8.g gVar) {
        String valueOf;
        String str;
        gVar.a();
        Context context = gVar.f46478a;
        kotlin.jvm.internal.j.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        gVar.a();
        String str3 = gVar.f46480c.f46489b;
        kotlin.jvm.internal.j.d(str3, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        kotlin.jvm.internal.j.d(packageName, "packageName");
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str = str2;
        } else {
            str = str4;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
        gVar.a();
        p b10 = q.b(context);
        gVar.a();
        return new b(str3, new a(packageName, str, str2, b10, q.a(context)));
    }
}
