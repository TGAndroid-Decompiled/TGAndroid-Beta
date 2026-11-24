package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class ds {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final hi2 h;

    public ds(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, hi2 hi2Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = hi2Var;
    }

    public static ds a(Context context, vl5 vl5Var, String str, String str2, ArrayList arrayList, hi2 hi2Var) {
        String num;
        String packageName = context.getPackageName();
        String d = vl5Var.d();
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
        return new ds(str, str2, arrayList, d, packageName, str3, str4, hi2Var);
    }
}
