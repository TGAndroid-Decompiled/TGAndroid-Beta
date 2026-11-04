package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
public class WearAuthListenerService extends Service implements z8.a {
    public static final int f21398r = 0;
    public ComponentName f21399a;
    public z8.f f21400b;
    public z8.d f21401c;
    public Intent d;
    public Looper f21402e;
    public boolean h;
    public final Object f21403f = new Object();
    public final a9.d f21404n = new a9.d(new kb.a(this, 29));

    @Override
    public final android.os.IBinder onBind(android.content.Intent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WearAuthListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.f21399a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.f21399a)));
        }
        if (this.f21402e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f21402e = handlerThread.getLooper();
        }
        this.f21400b = new z8.f(this, this.f21402e);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.f21399a);
        this.f21401c = new z8.d(this);
    }

    @Override
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.f21399a)));
        }
        synchronized (this.f21403f) {
            this.h = true;
            z8.f fVar = this.f21400b;
            if (fVar != null) {
                fVar.getLooper().quit();
                fVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.f21399a)));
            }
        }
        super.onDestroy();
    }

    @Override
    public final void a(a9.f fVar) {
    }

    @Override
    public final void b(a9.f fVar) {
    }

    @Override
    public final void c(a9.f fVar) {
    }

    @Override
    public final void d(a9.f fVar) {
    }
}
