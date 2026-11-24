package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            na7 q1 = na7.q1(y6c.t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                q1.t3 = string;
                q1.X3.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
