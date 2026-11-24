package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static fw2 a;

    @Override
    public final IBinder onBind(Intent intent) {
        fw2 fw2Var = a;
        fw2 fw2Var2 = fw2Var;
        if (fw2Var == null) {
            ?? abstractThreadedSyncAdapter = new AbstractThreadedSyncAdapter(this, true);
            a = abstractThreadedSyncAdapter;
            fw2Var2 = abstractThreadedSyncAdapter;
        }
        return fw2Var2.getSyncAdapterBinder();
    }
}
