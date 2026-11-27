package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
public final class qgb extends BroadcastReceiver {
    public final byte a = 0;
    public Context b;
    public Object c;

    public qgb(p3f p3fVar) {
        this.c = p3fVar;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        pr0 pr0Var = (pr0) this.c;
        if (pr0Var != null) {
            Context context = ((FirebaseMessaging) pr0Var.d).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    public final synchronized void b() {
        Context context = this.b;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.b = null;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        String str = null;
        switch (this.a) {
            case 0:
                pr0 pr0Var = (pr0) this.c;
                if (pr0Var != null && pr0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    pr0 pr0Var2 = (pr0) this.c;
                    Object obj = pr0Var2.d;
                    FirebaseMessaging.b(pr0Var2, 0L);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if (data != null) {
                    str = data.getSchemeSpecificPart();
                }
                if ("com.google.android.gms".equals(str)) {
                    ((p3f) this.c).a();
                    b();
                    return;
                }
                return;
        }
    }

    public qgb() {
    }
}
