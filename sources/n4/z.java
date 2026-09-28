package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15225c = d0.f15162b;
    public Context f15226a;
    public ContentResolver f15227b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15226a;
        int i10 = c0Var.f15160b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f15159a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f15161c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
