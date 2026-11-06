package a9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;
public final class g extends Handler {
    public boolean f759a;
    public final f f760b;
    public final WearAuthListenerService f761c;

    public g(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.f761c = wearAuthListenerService;
        this.f760b = new Object();
    }

    public final synchronized void a(String str) {
        if (!this.f759a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            String valueOf = String.valueOf(this.f761c.f21345a);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.f761c.unbindService(this.f760b);
        } catch (RuntimeException e10) {
            Log.e("WearableLS", "Exception when unbinding from local service", e10);
        }
        this.f759a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            try {
                if (!this.f759a) {
                    if (Log.isLoggable("WearableLS", 2)) {
                        Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.f761c.f21345a)));
                    }
                    WearAuthListenerService wearAuthListenerService = this.f761c;
                    wearAuthListenerService.bindService(wearAuthListenerService.d, this.f760b, 1);
                    this.f759a = true;
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
