package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class y {
    public static final boolean f16614c = c0.f16546b;
    public Context f16615a;
    public ContentResolver f16616b;

    public final boolean a(b0 b0Var, String str) {
        Context context = this.f16615a;
        int i10 = b0Var.f16544b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, b0Var.f16543a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, b0Var.f16545c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
