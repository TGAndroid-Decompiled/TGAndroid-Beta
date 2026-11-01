package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
public class WearAuthListenerService extends Service implements x8.a {
    public static final int f14531r = 0;
    public ComponentName f14532a;
    public x8.f f14533b;
    public x8.d f14534c;
    public Intent d;
    public Looper e;
    public boolean h;
    public final Object f14535f = new Object();
    public final y8.d f14536n = new y8.d(new jb.b(this, 26));

    @Override
    public final android.os.IBinder onBind(android.content.Intent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WearAuthListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.f14532a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.f14532a)));
        }
        if (this.e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.e = handlerThread.getLooper();
        }
        this.f14533b = new x8.f(this, this.e);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.f14532a);
        this.f14534c = new x8.d(this);
    }

    @Override
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.f14532a)));
        }
        synchronized (this.f14535f) {
            this.h = true;
            x8.f fVar = this.f14533b;
            if (fVar != null) {
                fVar.getLooper().quit();
                fVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.f14532a)));
            }
        }
        super.onDestroy();
    }

    @Override
    public final void a(y8.f fVar) {
    }

    @Override
    public final void b(y8.f fVar) {
    }

    @Override
    public final void c(y8.f fVar) {
    }

    @Override
    public final void d(y8.f fVar) {
    }
}
