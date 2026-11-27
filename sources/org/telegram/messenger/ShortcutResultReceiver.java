package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class ShortcutResultReceiver extends BroadcastReceiver {
    public static final int a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("account", yac.t0);
        pcc pccVar = (pcc) ls6.d0(intExtra).p1.remove(intent.getStringExtra("req_id"));
        if (pccVar != null) {
            hl.c3(new jn0(pccVar, (byte) 13));
        }
    }
}
