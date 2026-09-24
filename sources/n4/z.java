package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15209c = d0.f15146b;
    public Context f15210a;
    public ContentResolver f15211b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15210a;
        int i10 = c0Var.f15144b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f15143a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f15145c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
