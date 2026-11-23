package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            mp u12 = mp.u1(i10.f24637t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                u12.U3 = string;
                u12.h7.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
