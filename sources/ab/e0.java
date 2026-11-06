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
    public final int f920a = 0;
    public Context f921b;
    public Object f922c;

    public e0() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        f0 f0Var = (f0) this.f922c;
        if (f0Var != null) {
            Context context = f0Var.f926c.f7890b;
            this.f921b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public synchronized void b() {
        try {
            Context context = this.f921b;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f921b = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        String str;
        switch (this.f920a) {
            case 0:
                f0 f0Var = (f0) this.f922c;
                if (f0Var != null && f0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    f0 f0Var2 = (f0) this.f922c;
                    f0Var2.f926c.getClass();
                    FirebaseMessaging.b(f0Var2, 0L);
                    Context context2 = this.f921b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f922c = null;
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
                    ((cb.c) this.f922c).D();
                    b();
                    return;
                }
                return;
        }
    }

    public e0(cb.c cVar) {
        this.f922c = cVar;
    }
}
