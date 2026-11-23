package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static l5 f22607a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f22607a == null) {
            f22607a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f22607a.getSyncAdapterBinder();
    }
}
