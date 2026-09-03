package i9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f7351a;
    public final String f7352b;
    public final ArrayList f7353c;
    public final String d;
    public final String e;
    public final String f7354f;
    public final String f7355g;
    public final f7.b h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, f7.b bVar) {
        this.f7351a = str;
        this.f7352b = str2;
        this.f7353c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f7354f = str5;
        this.f7355g = str6;
        this.h = bVar;
    }

    public static a a(Context context, w wVar, String str, String str2, ArrayList arrayList, f7.b bVar) {
        String num;
        String packageName = context.getPackageName();
        String c3 = wVar.c();
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
        return new a(str, str2, arrayList, c3, packageName, str3, str4, bVar);
    }
}
