package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f22872a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", i10.f24637t0);
        w10 w10Var = (w10) ri.d0(intExtra).f26731p1.remove(intent.getStringExtra("req_id"));
        if (w10Var != null) {
            g0.g3(new fg(w10Var, 9));
        }
    }
}
