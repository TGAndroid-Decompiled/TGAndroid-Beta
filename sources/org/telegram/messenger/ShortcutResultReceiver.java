package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f21382a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", h10.f22829t0);
        u10 u10Var = (u10) li.b0(intExtra).f24042p1.remove(intent.getStringExtra("req_id"));
        if (u10Var != null) {
            g0.h3(new jf(u10Var, 9));
        }
    }
}
