package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static l5 f22710a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f22710a == null) {
            f22710a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f22710a.getSyncAdapterBinder();
    }
}
