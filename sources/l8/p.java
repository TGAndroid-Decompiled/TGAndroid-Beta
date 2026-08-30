package l8;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
public final class p extends Handler {
    public boolean f11723a;
    public final o f11724b;
    public final k f11725c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f11725c = kVar;
        this.f11724b = new Object();
    }

    public final synchronized void a(String str) {
        ComponentName componentName;
        if (!this.f11723a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.f11725c.zza;
            String valueOf = String.valueOf(componentName);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f11725c.unbindService(this.f11724b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.f11723a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        Intent intent;
        ComponentName componentName;
        synchronized (this) {
            try {
                if (!this.f11723a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        componentName = this.f11725c.zza;
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
                    }
                    k kVar = this.f11725c;
                    intent = kVar.zzd;
                    kVar.bindService(intent, this.f11724b, 1);
                    this.f11723a = true;
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
