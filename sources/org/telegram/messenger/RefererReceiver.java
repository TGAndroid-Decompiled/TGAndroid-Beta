package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            wp r12 = wp.r1(e20.f15506s0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                r12.T3 = string;
                r12.f7.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
