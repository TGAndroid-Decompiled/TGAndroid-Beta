package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f22769a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", k10.f24932t0);
        y10 y10Var = (y10) si.d0(intExtra).f26808p1.remove(intent.getStringExtra("req_id"));
        if (y10Var != null) {
            g0.g3(new gg(y10Var, 9));
        }
    }
}
