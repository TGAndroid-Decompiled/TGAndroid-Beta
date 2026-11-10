package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static j5 f21175a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f21175a == null) {
            f21175a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f21175a.getSyncAdapterBinder();
    }
}
