package org.telegram.messenger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
public class NotificationsService extends Service {
    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        t0.w();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        if (hp.f1().getBoolean("pushService", true)) {
            Intent intent = new Intent("org.telegram.start");
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i3, int i10) {
        return 1;
    }
}
