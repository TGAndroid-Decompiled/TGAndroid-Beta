package bb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import li.h5;
public final class f0 {
    public static final f0 f3755a = new Object();
    public static final h5 f3756b;

    static {
        ma.d dVar = new ma.d();
        dVar.d(e0.class, g.f3757a);
        dVar.d(n0.class, h.f3760a);
        dVar.d(j.class, e.f3747a);
        dVar.d(b.class, d.f3739a);
        dVar.d(a.class, c.f3730a);
        dVar.d(q.class, f.f3752a);
        dVar.d = true;
        f3756b = new h5(dVar);
    }

    public static b a(m9.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f18380a;
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
        String str3 = hVar.f18382c.f18391b;
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
