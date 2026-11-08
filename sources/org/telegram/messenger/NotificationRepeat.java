package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
public class NotificationRepeat extends IntentService {
    public static final int f21329a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", p10.f24470s0);
            if (!p10.r(intExtra)) {
                return;
            }
            g0.h3(new hi.j2(intExtra, 4));
        }
    }
}
