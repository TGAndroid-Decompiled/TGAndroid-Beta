package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f14996c = d0.f14933b;
    public Context f14997a;
    public ContentResolver f14998b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f14997a;
        int i10 = c0Var.f14931b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f14930a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f14932c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
