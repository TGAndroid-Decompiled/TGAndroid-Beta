package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static j5 f22249a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f22249a == null) {
            f22249a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f22249a.getSyncAdapterBinder();
    }
}
