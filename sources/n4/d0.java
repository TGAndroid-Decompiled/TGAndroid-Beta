package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;
public final class d0 {
    public static final boolean f14933b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object f14934c = new Object();
    public static volatile d0 d;
    public z f14935a;

    public static d0 a(Context context) {
        d0 d0Var;
        synchronized (f14934c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    obj2.f14997a = applicationContext;
                    obj2.f14998b = applicationContext.getContentResolver();
                    obj.f14935a = obj2;
                    d = obj;
                }
                d0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d0Var;
    }

    public final boolean b(a0 a0Var) {
        z zVar = this.f14935a;
        c0 c0Var = a0Var.f14929a;
        Context context = zVar.f14997a;
        int i10 = c0Var.f14931b;
        String str = c0Var.f14930a;
        int i11 = c0Var.f14932c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i10, i11) != 0) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                    if (!zVar.a(c0Var, "android.permission.STATUS_BAR_SERVICE") && !zVar.a(c0Var, "android.permission.MEDIA_CONTENT_CONTROL") && i11 != 1000) {
                        String string = Settings.Secure.getString(zVar.f14998b, "enabled_notification_listeners");
                        if (string != null) {
                            for (String str2 : string.split(":")) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (z.f14996c) {
                    Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
                }
            }
            return false;
        }
        return true;
    }
}
