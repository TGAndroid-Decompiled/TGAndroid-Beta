package e9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f4986a;
    public final String f4987b;
    public final ArrayList f4988c;
    public final String d;
    public final String f4989e;
    public final String f4990f;
    public final String f4991g;
    public final we.b h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, we.b bVar) {
        this.f4986a = str;
        this.f4987b = str2;
        this.f4988c = arrayList;
        this.d = str3;
        this.f4989e = str4;
        this.f4990f = str5;
        this.f4991g = str6;
        this.h = bVar;
    }

    public static a a(Context context, x xVar, String str, String str2, ArrayList arrayList, we.b bVar) {
        String num;
        String packageName = context.getPackageName();
        String c10 = xVar.c();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            num = Long.toString(packageInfo.getLongVersionCode());
        } else {
            num = Integer.toString(packageInfo.versionCode);
        }
        String str3 = num;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = "0.0";
        }
        return new a(str, str2, arrayList, c10, packageName, str3, str4, bVar);
    }
}
