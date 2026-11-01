package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
public class NotificationCallbackReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            w0.w();
            int intExtra = intent.getIntExtra("currentAccount", e20.f15506s0);
            if (!e20.r(intExtra)) {
                return;
            }
            long longExtra = intent.getLongExtra("did", 777000L);
            byte[] byteArrayExtra = intent.getByteArrayExtra("data");
            i0.g3(new sk(rz.C(intExtra), longExtra, intent.getIntExtra("mid", 0), byteArrayExtra, 10));
        }
    }
}
