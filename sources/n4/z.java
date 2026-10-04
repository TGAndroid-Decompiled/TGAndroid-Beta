package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f16642c = d0.f16573b;
    public Context f16643a;
    public ContentResolver f16644b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f16643a;
        int i10 = c0Var.f16571b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f16570a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f16572c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
