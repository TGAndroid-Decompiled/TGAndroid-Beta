package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
public class NotificationRepeat extends IntentService {
    public static final int f21380a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", h10.f22829t0);
            if (!h10.r(intExtra)) {
                return;
            }
            g0.h3(new ii.i2(intExtra, 4));
        }
    }
}
