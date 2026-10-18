package ab;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import ki.t1;
public final class f0 {
    public static final f0 f398a = new Object();
    public static final t1 f399b;

    static {
        la.d dVar = new la.d();
        dVar.a(e0.class, g.f400a);
        dVar.a(n0.class, h.f403a);
        dVar.a(j.class, e.f390a);
        dVar.a(b.class, d.f382a);
        dVar.a(a.class, c.f373a);
        dVar.a(q.class, f.f395a);
        dVar.d = true;
        f399b = new t1(dVar, 4);
    }

    public static b a(l9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f15966a;
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
        String str3 = hVar.f15968c.f15977b;
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
