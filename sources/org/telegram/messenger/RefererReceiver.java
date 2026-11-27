package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            uc7 s1 = uc7.s1(yac.t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                s1.u3 = string;
                s1.Y3.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
