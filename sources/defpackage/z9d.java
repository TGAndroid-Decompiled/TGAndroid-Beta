package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
public abstract class z9d {
    public static volatile UserManager a;
    public static volatile boolean b;

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        b = !z;
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            boolean z = b;
            if (!z) {
                UserManager userManager = a;
                if (userManager == null) {
                    synchronized (z9d.class) {
                        userManager = a;
                        if (userManager == null) {
                            UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                            a = userManager2;
                            if (userManager2 == null) {
                                b = true;
                                z = true;
                            } else {
                                userManager = userManager2;
                            }
                        }
                    }
                }
                z = userManager.isUserUnlocked();
                b = z;
                if (z) {
                    a = null;
                }
            }
            if (!z) {
                return true;
            }
            return false;
        }
        return false;
    }
}
