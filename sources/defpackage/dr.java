package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class dr {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final lv6 h;

    public dr(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, lv6 lv6Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = lv6Var;
    }

    public static dr a(Context context, wj5 wj5Var, String str, String str2, ArrayList arrayList, lv6 lv6Var) {
        String num;
        String packageName = context.getPackageName();
        String d = wj5Var.d();
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
        return new dr(str, str2, arrayList, d, packageName, str3, str4, lv6Var);
    }
}
