package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", z8c.t0);
        qac qacVar = (qac) hs6.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (qacVar != null) {
            gm.c3(new mo0(qacVar, (byte) 12));
        }
    }
}
