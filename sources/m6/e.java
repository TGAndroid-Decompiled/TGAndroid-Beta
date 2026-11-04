package m6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
public class e {
    public static final int f19188a;
    public static final e f19189b;

    static {
        int i3 = g.f19194e;
        f19188a = 12451000;
        f19189b = new Object();
    }

    public static int a(Context context) {
        int i3 = g.f19194e;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int i3, Context context, String str) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && w6.b.f(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb2 = new StringBuilder("gcore_");
            sb2.append(f19188a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(y6.b.a(context).d(0, context.getPackageName()).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb3 = sb2.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb3)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    public int c(Context context) {
        return d(context, f19188a);
    }

    public int d(Context context, int i3) {
        int b10 = g.b(context, i3);
        boolean z10 = true;
        if (b10 != 18) {
            if (b10 == 1) {
                z10 = g.c(context);
            } else {
                z10 = false;
            }
        }
        if (z10) {
            return 18;
        }
        return b10;
    }
}
