package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f14517a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", e20.f15506s0);
        r20 r20Var = (r20) vi.b0(intExtra).f18665o1.remove(intent.getStringExtra("req_id"));
        if (r20Var != null) {
            i0.g3(new qf(r20Var, 9));
        }
    }
}
