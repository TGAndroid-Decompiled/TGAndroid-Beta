package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
public abstract class wqe {
    public static ua8 a;

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.software.picture_in_picture") || ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:picture_in_picture", Process.myUid(), context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
