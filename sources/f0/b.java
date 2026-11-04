package f0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.o0;
public abstract class b {
    public static Intent a(Context context, o0 o0Var, IntentFilter intentFilter) {
        return context.registerReceiver(o0Var, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, o0 o0Var, IntentFilter intentFilter) {
        return context.registerReceiver(o0Var, intentFilter, null, null, 2);
    }
}
