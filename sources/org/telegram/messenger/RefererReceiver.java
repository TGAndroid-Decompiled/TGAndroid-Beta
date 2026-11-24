package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            oc7 r1 = oc7.r1(z8c.t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                r1.t3 = string;
                r1.X3.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
