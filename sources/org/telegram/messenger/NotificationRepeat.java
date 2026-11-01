package org.telegram.messenger;

import android.app.IntentService;
import android.content.Intent;
public class NotificationRepeat extends IntentService {
    public static final int f14515a = 0;

    public NotificationRepeat() {
        super("NotificationRepeat");
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra("currentAccount", e20.f15506s0);
            if (!e20.r(intExtra)) {
                return;
            }
            i0.g3(new xd(intExtra, 2));
        }
    }
}
