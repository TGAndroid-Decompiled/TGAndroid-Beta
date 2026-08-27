package f9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;

public final class a {

    public final String f5915a;

    public final String f5916b;

    public final ArrayList f5917c;
    public final String d;

    public final String f5918e;

    public final String f5919f;

    public final String f5920g;
    public final xe.b h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, xe.b bVar) {
        this.f5915a = str;
        this.f5916b = str2;
        this.f5917c = arrayList;
        this.d = str3;
        this.f5918e = str4;
        this.f5919f = str5;
        this.f5920g = str6;
        this.h = bVar;
    }

    public static a a(Context context, x xVar, String str, String str2, ArrayList arrayList, xe.b bVar) {
        String packageName = context.getPackageName();
        String strC = xVar.c();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, arrayList, strC, packageName, string, str3, bVar);
    }
}
