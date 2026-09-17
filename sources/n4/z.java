package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15006c = d0.f14943b;
    public Context f15007a;
    public ContentResolver f15008b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15007a;
        int i10 = c0Var.f14941b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f14940a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f14942c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
