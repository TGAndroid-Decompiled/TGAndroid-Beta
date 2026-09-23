package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f14971c = d0.f14908b;
    public Context f14972a;
    public ContentResolver f14973b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f14972a;
        int i10 = c0Var.f14906b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f14905a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f14907c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
