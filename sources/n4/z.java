package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f16525c = d0.f16456b;
    public Context f16526a;
    public ContentResolver f16527b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f16526a;
        int i10 = c0Var.f16454b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f16453a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f16455c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
