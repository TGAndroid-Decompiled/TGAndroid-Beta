package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class y {
    public static final boolean f16696c = c0.f16628b;
    public Context f16697a;
    public ContentResolver f16698b;

    public final boolean a(b0 b0Var, String str) {
        Context context = this.f16697a;
        int i10 = b0Var.f16626b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, b0Var.f16625a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, b0Var.f16627c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
