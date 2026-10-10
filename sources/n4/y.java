package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class y {
    public static final boolean f16618c = c0.f16550b;
    public Context f16619a;
    public ContentResolver f16620b;

    public final boolean a(b0 b0Var, String str) {
        Context context = this.f16619a;
        int i10 = b0Var.f16548b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, b0Var.f16547a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, b0Var.f16549c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
