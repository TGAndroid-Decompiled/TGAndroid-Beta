package aa;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.ArrayList;
import sg.i0;
public final class a {
    public final String f767a;
    public final String f768b;
    public final ArrayList f769c;
    public final String d;
    public final String f770e;
    public final String f771f;
    public final String f772g;
    public final i0 h;

    public a(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, i0 i0Var) {
        this.f767a = str;
        this.f768b = str2;
        this.f769c = arrayList;
        this.d = str3;
        this.f770e = str4;
        this.f771f = str5;
        this.f772g = str6;
        this.h = i0Var;
    }

    public static a a(Context context, b0 b0Var, String str, String str2, ArrayList arrayList, i0 i0Var) {
        String num;
        String packageName = context.getPackageName();
        String d = b0Var.d();
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
        return new a(str, str2, arrayList, d, packageName, str3, str4, i0Var);
    }
}
