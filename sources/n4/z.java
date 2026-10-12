package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f16364c = d0.f16295b;
    public Context f16365a;
    public ContentResolver f16366b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f16365a;
        int i10 = c0Var.f16293b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f16292a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f16294c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
