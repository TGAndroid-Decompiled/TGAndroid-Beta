package l8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f12130a;
    public final o f12131b;
    public final k f12132c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f12132c = kVar;
        this.f12131b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f12130a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f12132c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f12132c.unbindService(this.f12131b);
        } catch (RuntimeException e6) {
            Log.e("WearableLS", "Exception when unbinding from local service", e6);
        }
        this.f12130a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f12130a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f12132c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f12132c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f12131b, 1);
                    this.f12130a = true;
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
