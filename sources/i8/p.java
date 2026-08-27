package i8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public final class p extends Handler {

    public boolean f10959a;

    public final o f10960b;

    public final k f10961c;

    public p(k kVar, Looper looper) {
        super(looper);
        this.f10961c = kVar;
        this.f10960b = new o();
    }

    public final synchronized void a(String str) {
        if (this.f10959a) {
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.f10961c.zza));
            }
            try {
                this.f10961c.unbindService(this.f10960b);
            } catch (RuntimeException e9) {
                Log.e("WearableLS", "Exception when unbinding from local service", e9);
            }
            this.f10959a = false;
        }
    }

    @Override
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.f10959a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.f10961c.zza)));
                    }
                    k kVar = this.f10961c;
                    kVar.bindService(kVar.zzd, this.f10960b, 1);
                    this.f10959a = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            super.dispatchMessage(message);
            if (hasMessages(0)) {
            }
        } finally {
            if (!hasMessages(0)) {
                a("dispatch");
            }
        }
    }
}
