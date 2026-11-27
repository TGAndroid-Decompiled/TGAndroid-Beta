package defpackage;

import android.app.AppOpsManager;
import android.os.Process;
import android.text.TextUtils;
import org.telegram.messenger.a;
public abstract class f3f {
    public static boolean a() {
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOpNoThrow", cls, cls, String.class).invoke((AppOpsManager) a.b.getSystemService("appops"), 10020, Integer.valueOf(Process.myUid()), a.b.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            cc4.g(e, true);
            return true;
        }
    }

    public static boolean b() {
        return !TextUtils.isEmpty(hl.j1("ro.miui.ui.version.name"));
    }
}
