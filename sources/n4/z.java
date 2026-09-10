package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f13826c = d0.f13763b;
    public Context f13827a;
    public ContentResolver f13828b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f13827a;
        int i10 = c0Var.f13761b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f13760a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f13762c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
