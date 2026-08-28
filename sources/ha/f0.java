package ha;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class f0 {
    public static final f0 f10298a = new Object();
    public static final n2.p f10299b;

    static {
        s9.d dVar = new s9.d();
        dVar.l(e0.class, g.f10300a);
        dVar.l(n0.class, h.f10303a);
        dVar.l(j.class, e.f10289a);
        dVar.l(b.class, d.f10280a);
        dVar.l(a.class, c.f10269a);
        dVar.l(q.class, f.f10294a);
        dVar.d = true;
        f10299b = new n2.p(dVar, 21);
    }

    public static b a(s8.h hVar) {
        String valueOf;
        String str;
        hVar.a();
        Context context = hVar.f47470a;
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
        String str3 = hVar.f47472c.f47483b;
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
