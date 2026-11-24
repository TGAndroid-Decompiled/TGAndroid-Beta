package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static uu2 a;

    @Override
    public final IBinder onBind(Intent intent) {
        uu2 uu2Var = a;
        uu2 uu2Var2 = uu2Var;
        if (uu2Var == null) {
            ?? abstractThreadedSyncAdapter = new AbstractThreadedSyncAdapter(this, true);
            a = abstractThreadedSyncAdapter;
            uu2Var2 = abstractThreadedSyncAdapter;
        }
        return uu2Var2.getSyncAdapterBinder();
    }
}
