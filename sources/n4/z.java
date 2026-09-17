package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f16498c = d0.f16429b;
    public Context f16499a;
    public ContentResolver f16500b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f16499a;
        int i10 = c0Var.f16427b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f16426a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f16428c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
