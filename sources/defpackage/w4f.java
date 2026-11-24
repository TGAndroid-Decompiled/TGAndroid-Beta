package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import org.telegram.messenger.WearAuthListenerService;
public final class w4f extends Handler {
    public boolean a;
    public final d2f b;
    public final WearAuthListenerService c;

    public w4f(WearAuthListenerService wearAuthListenerService, Looper looper) {
        super(looper);
        this.c = wearAuthListenerService;
        this.b = new Object();
    }

    public final synchronized void a(String str) {
        if (!this.a) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            String valueOf = String.valueOf(this.c.a);
            Log.v("WearableLS", "unbindService: " + str + ", " + valueOf);
        }
        try {
            this.c.unbindService(this.b);
        } catch (RuntimeException e) {
            Log.e("WearableLS", "Exception when unbinding from local service", e);
        }
        this.a = false;
    }

    @Override
    public final void dispatchMessage(Message message) {
        synchronized (this) {
            if (!this.a) {
                if (Log.isLoggable("WearableLS", 2)) {
                    Log.v("WearableLS", "bindService: ".concat(String.valueOf(this.c.a)));
                }
                WearAuthListenerService wearAuthListenerService = this.c;
                wearAuthListenerService.bindService(wearAuthListenerService.d, this.b, 1);
                this.a = true;
            }
        }
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                a("dispatch");
            }
        }
    }
}
