package ja;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class f0 {
    public static final f0 f11333a = new Object();
    public static final o1.a f11334b;

    static {
        u9.d dVar = new u9.d();
        dVar.i(e0.class, g.f11335a);
        dVar.i(n0.class, h.f11338a);
        dVar.i(j.class, e.f11324a);
        dVar.i(b.class, d.f11315a);
        dVar.i(a.class, c.f11304a);
        dVar.i(q.class, f.f11329a);
        dVar.d = true;
        f11334b = new o1.a(dVar, 27);
    }

    public static b a(u8.g gVar) {
        String valueOf;
        String str;
        gVar.a();
        Context context = gVar.f49131a;
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
        String str3 = gVar.f49133c.f49144b;
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
        q b10 = r.b(context);
        gVar.a();
        return new b(str3, new a(packageName, str, str2, b10, r.a(context)));
    }
}
