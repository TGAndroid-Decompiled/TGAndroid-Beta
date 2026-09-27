package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15259c = d0.f15196b;
    public Context f15260a;
    public ContentResolver f15261b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15260a;
        int i10 = c0Var.f15194b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f15193a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f15195c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
