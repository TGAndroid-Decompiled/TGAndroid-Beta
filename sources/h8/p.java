package h8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f10250a;
    public final o f10251b;
    public final k f10252c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f10252c = kVar;
        this.f10251b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f10250a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f10252c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f10252c.unbindService(this.f10251b);
        } catch (RuntimeException e10) {
            Log.e("WearableLS", "Exception when unbinding from local service", e10);
        }
        this.f10250a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f10250a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f10252c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f10252c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f10251b, 1);
                    this.f10250a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            super.dispatchMessage(message);
            if (!hasMessages(0)) {
                a("dispatch");
            }
        } catch (Throwable th2) {
            if (!hasMessages(0)) {
                a("dispatch");
            }
            throw th2;
        }
    }
}
