package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f15224c = d0.f15161b;
    public Context f15225a;
    public ContentResolver f15226b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f15225a;
        int i10 = c0Var.f15159b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f15158a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f15160c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
