package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f16646c = d0.f16577b;
    public Context f16647a;
    public ContentResolver f16648b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f16647a;
        int i10 = c0Var.f16575b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f16574a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f16576c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
