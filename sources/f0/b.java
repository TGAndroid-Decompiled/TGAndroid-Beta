package f0;

import ab.e0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
public abstract class b {
    public static Intent a(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 0);
    }

    public static Intent b(Context context, e0 e0Var, IntentFilter intentFilter) {
        return context.registerReceiver(e0Var, intentFilter, null, null, 2);
    }
}
