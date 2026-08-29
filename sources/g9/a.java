package g9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f7139a;
    public final String f7140b;
    public final ArrayList f7141c;
    public final String d;
    public final String f7142e;
    public final String f7143f;
    public final String f7144g;
    public final ze.b h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, ze.b bVar) {
        this.f7139a = str;
        this.f7140b = str2;
        this.f7141c = arrayList;
        this.d = str3;
        this.f7142e = str4;
        this.f7143f = str5;
        this.f7144g = str6;
        this.h = bVar;
    }

    public static a a(Context context, y yVar, String str, String str2, ArrayList arrayList, ze.b bVar) {
        String num;
        String packageName = context.getPackageName();
        String c3 = yVar.c();
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
