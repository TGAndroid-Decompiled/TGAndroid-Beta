package l8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f11833a;
    public final o f11834b;
    public final k f11835c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f11835c = kVar;
        this.f11834b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f11833a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f11835c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f11835c.unbindService(this.f11834b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f11833a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f11833a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f11835c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f11835c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f11834b, 1);
                    this.f11833a = true;
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
