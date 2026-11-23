package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
public class NotificationRepeat extends IntentService {
    public static final int f22803a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", k10.f24968t0);
            if (!k10.r(intExtra)) {
                return;
            }
            g0.g3(new jg.x(intExtra, 4));
        }
    }
}
