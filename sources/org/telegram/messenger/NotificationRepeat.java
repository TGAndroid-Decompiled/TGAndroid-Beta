package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
public class NotificationRepeat extends IntentService {
    public static final int a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
            if (!y6c.q(intExtra)) {
                return;
            }
            gl.d3(new xv0(intExtra, (byte) 8));
        }
    }
}
