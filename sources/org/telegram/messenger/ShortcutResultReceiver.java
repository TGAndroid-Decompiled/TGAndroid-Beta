package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f22411a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", m10.f24940t0);
        z10 z10Var = (z10) si.b0(intExtra).f26502p1.remove(intent.getStringExtra("req_id"));
        if (z10Var != null) {
            g0.h3(new qf(z10Var, 9));
        }
    }
}
