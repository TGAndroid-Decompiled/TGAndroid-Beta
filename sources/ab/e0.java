package ab;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
public final class e0 extends BroadcastReceiver {
    public final int f918a = 0;
    public Context f919b;
    public Object f920c;

    public e0() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        f0 f0Var = (f0) this.f920c;
        if (f0Var != null) {
            Context context = f0Var.f924c.f7554b;
            this.f919b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public synchronized void b() {
        try {
            Context context = this.f919b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f919b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.f918a) {
            case 0:
                f0 f0Var = (f0) this.f920c;
                if (f0Var != null && f0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    f0 f0Var2 = (f0) this.f920c;
                    f0Var2.f924c.getClass();
                    FirebaseMessaging.b(f0Var2, 0L);
                    Context context2 = this.f919b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f920c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                } else {
                    str = null;
                }
                if ("com.google.android.gms".equals(str)) {
                    ((d6.i) this.f920c).D();
                    b();
                    return;
                }
                return;
        }
    }

    public e0(d6.i iVar) {
        this.f920c = iVar;
    }
}
