package org.telegram.messenger;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;
public class ContactsSyncAdapterService extends Service {
    public static pv2 a;

    @Override
    public final IBinder onBind(Intent intent) {
        pv2 pv2Var = a;
        pv2 pv2Var2 = pv2Var;
        if (pv2Var == null) {
            ?? abstractThreadedSyncAdapter = new AbstractThreadedSyncAdapter(this, true);
            a = abstractThreadedSyncAdapter;
            pv2Var2 = abstractThreadedSyncAdapter;
        }
        return pv2Var2.getSyncAdapterBinder();
    }
}
