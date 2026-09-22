package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f14994c = d0.f14931b;
    public Context f14995a;
    public ContentResolver f14996b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f14995a;
        int i10 = c0Var.f14929b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f14928a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f14930c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
