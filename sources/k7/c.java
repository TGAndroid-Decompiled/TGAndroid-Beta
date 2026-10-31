package k7;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.api.internal.v0;
public abstract class c extends f0.c {
    public static void e(Context context, v0 v0Var, IntentFilter intentFilter) {
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            if (i11 >= 33) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            context.registerReceiver(v0Var, intentFilter, i10);
            return;
        }
        context.registerReceiver(v0Var, intentFilter);
    }
}
