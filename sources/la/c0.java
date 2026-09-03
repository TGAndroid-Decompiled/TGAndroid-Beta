package la;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.telegram.ui.Components.tp0;
public final class c0 {
    public static final c0 f11855a = new Object();
    public static final tp0 f11856b;

    static {
        w9.d dVar = new w9.d();
        dVar.b(b0.class, g.f11878a);
        dVar.b(k0.class, h.f11884a);
        dVar.b(j.class, e.f11862a);
        dVar.b(b.class, d.f11857a);
        dVar.b(a.class, c.f11850a);
        dVar.b(p.class, f.f11868a);
        dVar.d = true;
        f11856b = new tp0(dVar, 23);
    }

    public static b a(w8.g gVar) {
        String valueOf;
        String str;
        gVar.a();
        Context context = gVar.f46560a;
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
        String str3 = gVar.f46562c.f46571b;
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
