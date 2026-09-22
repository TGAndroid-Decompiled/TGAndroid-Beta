package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15232c = d0.f15170b;
    public Context f15233a;
    public ContentResolver f15234b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15233a;
        int i10 = c0Var.f15168b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f15167a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f15169c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
