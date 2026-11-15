package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class RefererReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            np s12 = np.s1(m10.f24940t0);
            String string = intent.getExtras().getString("referrer");
            if (string != null) {
                s12.S3 = string;
                s12.f25283f7.edit().putString("installReferer", string).commit();
            }
        } catch (Exception unused) {
        }
    }
}
