package ab;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
public final class k0 extends BroadcastReceiver {
    public l0 f960a;
    public final l0 f961b;

    public k0(l0 l0Var, l0 l0Var2) {
        this.f961b = l0Var;
        this.f960a = l0Var2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f961b.f965a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public final synchronized void onReceive(android.content.Context r5, android.content.Intent r6) {
        throw new UnsupportedOperationException("Method not decompiled: ab.k0.onReceive(android.content.Context, android.content.Intent):void");
    }
}
