package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f14516a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", d20.f15147s0);
        q20 q20Var = (q20) ui.b0(intExtra).f18336o1.remove(intent.getStringExtra("req_id"));
        if (q20Var != null) {
            i0.g3(new pf(q20Var, 9));
        }
    }
}
