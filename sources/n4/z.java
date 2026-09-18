package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15181c = d0.f15118b;
    public Context f15182a;
    public ContentResolver f15183b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15182a;
        int i10 = c0Var.f15116b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f15115a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f15117c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
