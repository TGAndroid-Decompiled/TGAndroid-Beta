package g7;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

public abstract class w6 {

    public static String f6630a;

    public static String a(LaunchActivity launchActivity) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        String str = f6630a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager2 = launchActivity.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager2.resolveActivity(intent, 0);
        String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = packageManager2.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager2.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f6630a = null;
        } else if (arrayList.size() == 1) {
            f6630a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                List<ResolveInfo> listQueryIntentActivities2 = launchActivity.getPackageManager().queryIntentActivities(intent, 64);
                if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ResolveInfo next = it.next();
                            IntentFilter intentFilter = next.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && next.activityInfo != null) {
                            }
                        } else if (arrayList.contains(str2)) {
                            f6630a = str2;
                        }
                        if (arrayList.contains("com.android.chrome")) {
                            f6630a = "com.android.chrome";
                        } else if (arrayList.contains("com.chrome.beta")) {
                            f6630a = "com.chrome.beta";
                        } else if (arrayList.contains("com.chrome.dev")) {
                            f6630a = "com.chrome.dev";
                        } else if (arrayList.contains("com.google.android.apps.chrome")) {
                            f6630a = "com.google.android.apps.chrome";
                        }
                    }
                } else if (arrayList.contains(str2)) {
                    f6630a = str2;
                } else if (arrayList.contains("com.android.chrome")) {
                    f6630a = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    f6630a = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    f6630a = "com.chrome.dev";
                } else if (arrayList.contains("com.google.android.apps.chrome")) {
                    f6630a = "com.google.android.apps.chrome";
                }
            } catch (RuntimeException unused) {
                Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
            }
        } else if (arrayList.contains("com.android.chrome")) {
            f6630a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f6630a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f6630a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f6630a = "com.google.android.apps.chrome";
        }
        try {
            if ("com.sec.android.app.sbrowser".equalsIgnoreCase(f6630a) && (applicationInfo = (packageManager = ApplicationLoader.applicationContext.getPackageManager()).getApplicationInfo("com.android.chrome", 0)) != null && applicationInfo.enabled) {
                packageManager.getPackageInfo("com.android.chrome", 1);
                f6630a = "com.android.chrome";
            }
        } catch (Throwable unused2) {
        }
        return f6630a;
    }
}
