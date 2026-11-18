package gb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import org.telegram.ui.Cells.b5;
public final class p0 {
    public static final p0 f13398a = new Object();
    public static final b5 f13399b;

    static {
        pa.d dVar = new pa.d();
        dVar.b(o0.class, g.f13342a);
        dVar.b(v0.class, h.f13349a);
        dVar.b(k.class, e.f13331a);
        dVar.b(b.class, d.f13311a);
        dVar.b(a.class, c.f13299a);
        dVar.b(e0.class, f.f13338a);
        dVar.d = true;
        f13399b = new b5(dVar);
    }

    public static b a(o9.g gVar) {
        String valueOf;
        String str;
        gVar.a();
        Context context = gVar.f21763a;
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
        String str3 = gVar.f21765c.f21776b;
        kotlin.jvm.internal.j.d(str3, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        y yVar = y.f13440b;
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
        e0 b10 = f0.b(context);
        gVar.a();
        return new b(str3, new a(packageName, str, str2, b10, f0.a(context)));
    }
}
