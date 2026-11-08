package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int f21331a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", p10.f24470s0);
        c20 c20Var = (c20) ui.b0(intExtra).f25831o1.remove(intent.getStringExtra("req_id"));
        if (c20Var != null) {
            g0.h3(new rf(c20Var, 9));
        }
    }
}
