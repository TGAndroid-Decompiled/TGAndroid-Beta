package i9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f7931a;
    public final String f7932b;
    public final ArrayList f7933c;
    public final String d;
    public final String f7934e;
    public final String f7935f;
    public final String f7936g;
    public final f7.b h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, f7.b bVar) {
        this.f7931a = str;
        this.f7932b = str2;
        this.f7933c = arrayList;
        this.d = str3;
        this.f7934e = str4;
        this.f7935f = str5;
        this.f7936g = str6;
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
