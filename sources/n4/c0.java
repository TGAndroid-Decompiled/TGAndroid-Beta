package n4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.util.Log;
public final class c0 {
    public static final boolean f16628b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object f16629c = new Object();
    public static volatile c0 d;
    public y f16630a;

    public static c0 a(Context context) {
        c0 c0Var;
        synchronized (f16629c) {
            try {
                if (d == null) {
                    Context applicationContext = context.getApplicationContext();
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    obj2.f16697a = applicationContext;
                    obj2.f16698b = applicationContext.getContentResolver();
                    obj.f16630a = obj2;
                    d = obj;
                }
                c0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    public final boolean b(z zVar) {
        y yVar = this.f16630a;
        b0 b0Var = zVar.f16699a;
        Context context = yVar.f16697a;
        int i10 = b0Var.f16626b;
        String str = b0Var.f16625a;
        int i11 = b0Var.f16627c;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", i10, i11) != 0) {
            try {
                if (context.getPackageManager().getApplicationInfo(str, 0) != null) {
                    if (!yVar.a(b0Var, "android.permission.STATUS_BAR_SERVICE") && !yVar.a(b0Var, "android.permission.MEDIA_CONTENT_CONTROL") && i11 != 1000) {
                        String string = Settings.Secure.getString(yVar.f16698b, "enabled_notification_listeners");
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
                if (y.f16696c) {
                    Log.d("MediaSessionManager", "Package " + str + " doesn't exist");
                }
            }
            return false;
        }
        return true;
    }
}
