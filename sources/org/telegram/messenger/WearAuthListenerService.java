package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
public class WearAuthListenerService extends Service implements a9.a {
    public static final int f22785r = 0;
    public ComponentName f22786a;
    public a9.g f22787b;
    public a9.d f22788c;
    public Intent d;
    public Looper f22789e;
    public boolean h;
    public final Object f22790f = new Object();
    public final b9.d f22791n = new b9.d(new qb.a(this));

    @Override
    public final android.os.IBinder onBind(android.content.Intent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WearAuthListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.f22786a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.f22786a)));
        }
        if (this.f22789e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f22789e = handlerThread.getLooper();
        }
        this.f22787b = new a9.g(this, this.f22789e);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.f22786a);
        this.f22788c = new a9.d(this);
    }

    @Override
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.f22786a)));
        }
        synchronized (this.f22790f) {
            this.h = true;
            a9.g gVar = this.f22787b;
            if (gVar != null) {
                gVar.getLooper().quit();
                gVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.f22786a)));
            }
        }
        super.onDestroy();
    }

    @Override
    public final void a(b9.f fVar) {
    }

    @Override
    public final void b(b9.f fVar) {
    }

    @Override
    public final void c(b9.f fVar) {
    }

    @Override
    public final void d(b9.f fVar) {
    }
}
