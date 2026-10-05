package n4;

import android.content.ContentResolver;
import android.content.Context;
public final class z {
    public static final boolean f16651c = d0.f16582b;
    public Context f16652a;
    public ContentResolver f16653b;

    public final boolean a(c0 c0Var, String str) {
        Context context = this.f16652a;
        int i10 = c0Var.f16580b;
        if (i10 < 0) {
            if (context.getPackageManager().checkPermission(str, c0Var.f16579a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i10, c0Var.f16581c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
