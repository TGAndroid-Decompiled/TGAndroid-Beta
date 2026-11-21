package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f22802a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", j10.f24798t0);
        x10 x10Var = (x10) ri.d0(intExtra).f26658p1.remove(intent.getStringExtra("req_id"));
        if (x10Var != null) {
            g0.g3(new fg(x10Var, 9));
        }
    }
}
