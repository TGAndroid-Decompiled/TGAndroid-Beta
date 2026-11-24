package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
public final class syb extends BroadcastReceiver {
    public tyb a;
    public final tyb b;

    public syb(tyb tybVar, tyb tybVar2) {
        this.b = tybVar;
        this.a = tybVar2;
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
        tyb tybVar = this.a;
        if (tybVar == null) {
            return;
        }
        if (!tybVar.d()) {
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
        tyb tybVar2 = this.a;
        tybVar2.d.e.schedule(tybVar2, 0L, TimeUnit.SECONDS);
        context.unregisterReceiver(this);
        this.a = null;
    }
}
