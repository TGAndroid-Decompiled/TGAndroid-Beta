package a8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
public abstract class u9 {
    public static Intent a(Context context, ComponentName componentName) {
        String b10 = b(context, componentName);
        if (b10 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b10);
        if (b(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String b(Context context, ComponentName componentName) {
        int i7;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            i7 = 269222528;
        } else if (i10 >= 24) {
            i7 = 787072;
        } else {
            i7 = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i7);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }
}
