package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static j5 f21167a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f21167a == null) {
            f21167a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f21167a.getSyncAdapterBinder();
    }
}
