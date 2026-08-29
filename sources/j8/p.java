package j8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f11286a;
    public final o f11287b;
    public final k f11288c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f11288c = kVar;
        this.f11287b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f11286a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f11288c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f11288c.unbindService(this.f11287b);
        } catch (RuntimeException e10) {
            Log.e("WearableLS", "Exception when unbinding from local service", e10);
        }
        this.f11286a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f11286a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f11288c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f11288c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f11287b, 1);
                    this.f11286a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            super.dispatchMessage(message);
            if (!hasMessages(0)) {
                a("dispatch");
            }
        } catch (Throwable th3) {
            if (!hasMessages(0)) {
                a("dispatch");
            }
            throw th3;
        }
    }
}
