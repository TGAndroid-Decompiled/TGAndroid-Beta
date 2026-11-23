package gb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.telegram.ui.ActionBar.i5;
public final class q0 {
    public static final q0 f13392a = new Object();
    public static final i5 f13393b;

    static {
        pa.d dVar = new pa.d();
        dVar.c(p0.class, g.f13336a);
        dVar.c(w0.class, h.f13339a);
        dVar.c(k.class, e.f13311a);
        dVar.c(b.class, d.f13299a);
        dVar.c(a.class, c.f13288a);
        dVar.c(f0.class, f.f13328a);
        dVar.d = true;
        f13393b = new i5(dVar);
    }

    public static b a(o9.g gVar) {
        String valueOf;
        String str;
        gVar.a();
        Context context = gVar.f21854a;
        kotlin.jvm.internal.j.d(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            valueOf = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str2 = valueOf;
        gVar.a();
        String str3 = gVar.f21856c.f21867b;
        kotlin.jvm.internal.j.d(str3, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        z zVar = z.f13436b;
        kotlin.jvm.internal.j.b(packageName);
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str = str2;
        } else {
            str = str4;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.j.d(MANUFACTURER, "MANUFACTURER");
        gVar.a();
        f0 b10 = g0.b(context);
        gVar.a();
        return new b(str3, new a(packageName, str, str2, b10, g0.a(context)));
    }
}
