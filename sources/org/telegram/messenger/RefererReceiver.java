package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            qp s12 = qp.s1(p10.f24474s0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                s12.R3 = string;
                s12.f24778e7.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
