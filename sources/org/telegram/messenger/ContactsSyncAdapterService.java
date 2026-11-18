package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static l5 f22612a;

    @Override
    public final IBinder onBind(Intent intent) {
        if (f22612a == null) {
            f22612a = new AbstractThreadedSyncAdapter(this, true);
        }
        return f22612a.getSyncAdapterBinder();
    }
}
