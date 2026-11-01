package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static l5 f14360a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f14360a == null) {
            f14360a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f14360a.getSyncAdapterBinder();
    }
}
