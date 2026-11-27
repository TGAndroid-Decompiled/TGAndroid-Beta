package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
public final class r0c extends BroadcastReceiver {
    public s0c a;
    public final s0c b;

    public r0c(s0c s0cVar, s0c s0cVar2) {
        this.b = s0cVar;
        this.a = s0cVar2;
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
        s0c s0cVar = this.a;
        if (s0cVar == null) {
            return;
        }
        if (!s0cVar.d()) {
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
        s0c s0cVar2 = this.a;
        s0cVar2.d.e.schedule(s0cVar2, 0L, TimeUnit.SECONDS);
        context.unregisterReceiver(this);
        this.a = null;
    }
}
