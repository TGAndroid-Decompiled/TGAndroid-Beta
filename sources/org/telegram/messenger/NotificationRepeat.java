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
            int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
            if (!z8c.q(intExtra)) {
                return;
            }
            gm.c3(new fx0(intExtra, (byte) 8));
        }
    }
}
