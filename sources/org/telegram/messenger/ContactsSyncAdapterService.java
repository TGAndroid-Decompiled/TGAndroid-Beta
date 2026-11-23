package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static l5 f22643a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f22643a == null) {
            f22643a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f22643a.getSyncAdapterBinder();
    }
}
