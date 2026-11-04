package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static j5 f21220a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f21220a == null) {
            f21220a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f21220a.getSyncAdapterBinder();
    }
}
