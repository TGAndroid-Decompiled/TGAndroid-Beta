package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
public final class pwb extends BroadcastReceiver {
    public qwb a;
    public final qwb b;

    public pwb(qwb qwbVar, qwb qwbVar2) {
        this.b = qwbVar;
        this.a = qwbVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public final synchronized void onReceive(Context context, Intent intent) {
        boolean z;
        qwb qwbVar = this.a;
        if (qwbVar == null) {
            return;
        }
        if (!qwbVar.d()) {
            return;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
        qwb qwbVar2 = this.a;
        qwbVar2.d.e.schedule(qwbVar2, 0L, TimeUnit.SECONDS);
        context.unregisterReceiver(this);
        this.a = null;
    }
}
