package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            hp s12 = hp.s1(h10.f22829t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                s12.S3 = string;
                s12.f22999e7.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
