package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15219c = d0.f15157b;
    public Context f15220a;
    public ContentResolver f15221b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15220a;
        int i10 = c0Var.f15155b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f15154a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f15156c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
