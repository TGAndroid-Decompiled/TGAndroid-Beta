package gb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
public final class q0 {
    public static final q0 f13746a = new Object();
    public static final org.telegram.ui.Components.m f13747b;

    static {
        pa.d dVar = new pa.d();
        dVar.b(p0.class, g.f13687a);
        dVar.b(x0.class, h.f13691a);
        dVar.b(k.class, e.f13661a);
        dVar.b(b.class, d.f13647a);
        dVar.b(a.class, c.f13636a);
        dVar.b(f0.class, f.f13671a);
        dVar.d = true;
        f13747b = new org.telegram.ui.Components.m(dVar);
    }

    public static b a(o9.g gVar) {
        String valueOf;
        String str;
        gVar.a();
        Context context = gVar.f20880a;
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
        String str3 = gVar.f20882c.f20893b;
        kotlin.jvm.internal.j.d(str3, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.j.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.d(RELEASE, "RELEASE");
        y yVar = y.f13784b;
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
