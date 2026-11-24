package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
public final class ucb extends BroadcastReceiver {
    public final byte a = 0;
    public Context b;
    public Object c;

    public ucb(wye wyeVar) {
        this.c = wyeVar;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        vcb vcbVar = (vcb) this.c;
        if (vcbVar != null) {
            Context context = vcbVar.c.b;
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
                vcb vcbVar = (vcb) this.c;
                if (vcbVar != null && vcbVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    vcb vcbVar2 = (vcb) this.c;
                    FirebaseMessaging firebaseMessaging = vcbVar2.c;
                    FirebaseMessaging.b(vcbVar2, 0L);
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
                    ((wye) this.c).a();
                    b();
                    return;
                }
                return;
        }
    }

    public ucb() {
    }
}
