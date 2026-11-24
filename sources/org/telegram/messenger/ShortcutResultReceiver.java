package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", y6c.t0);
        p8c p8cVar = (p8c) hq6.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (p8cVar != null) {
            gl.d3(new mn0(p8cVar, (byte) 12));
        }
    }
}
