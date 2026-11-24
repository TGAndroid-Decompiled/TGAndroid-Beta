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
        a.v();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        if (oc7.e1().getBoolean("pushService", true)) {
            Intent intent = new Intent("org.telegram.start");
            intent.setPackage(getPackageName());
            sendBroadcast(intent);
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
