package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
public class WearAuthListenerService extends Service implements a9.a {
    public static final int f21347r = 0;
    public ComponentName f21348a;
    public a9.g f21349b;
    public a9.d f21350c;
    public Intent d;
    public Looper f21351e;
    public boolean h;
    public final Object f21352f = new Object();
    public final b9.d f21353n = new b9.d(new qb.a(this));

    @Override
    public final android.os.IBinder onBind(android.content.Intent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WearAuthListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.f21348a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.f21348a)));
        }
        if (this.f21351e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f21351e = handlerThread.getLooper();
        }
        this.f21349b = new a9.g(this, this.f21351e);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.f21348a);
        this.f21350c = new a9.d(this);
    }

    @Override
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.f21348a)));
        }
        synchronized (this.f21352f) {
            this.h = true;
            a9.g gVar = this.f21349b;
            if (gVar != null) {
                gVar.getLooper().quit();
                gVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.f21348a)));
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
