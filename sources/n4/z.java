package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f16641c = d0.f16572b;
    public Context f16642a;
    public ContentResolver f16643b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f16642a;
        int i10 = c0Var.f16570b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f16569a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f16571c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
