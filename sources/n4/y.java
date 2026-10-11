package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class y {
    public static final boolean f16660c = c0.f16592b;
    public Context f16661a;
    public ContentResolver f16662b;

    public final boolean a(b0 b0Var, String str) {
        Context context = this.f16661a;
        int i10 = b0Var.f16590b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, b0Var.f16589a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, b0Var.f16591c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
