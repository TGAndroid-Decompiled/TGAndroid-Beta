package c8;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
public abstract class kc {
    public static ti.n f5745a;

    public static boolean a(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") || ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
