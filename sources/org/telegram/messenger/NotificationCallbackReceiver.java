package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            t0.w();
            int intExtra = intent.getIntExtra("currentAccount", j10.f24770t0);
            if (!j10.r(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("did", 777000L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            g0.g3(new ek(zy.C(intExtra), longExtra, intent.getIntExtra("mid", 0), byteArrayExtra, 10));
        }
    }
}
