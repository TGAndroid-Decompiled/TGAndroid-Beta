package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
public class WearAuthListenerService extends Service implements a9.a {
    public static final int f22888r = 0;
    public ComponentName f22889a;
    public a9.g f22890b;
    public a9.d f22891c;
    public Intent d;
    public Looper f22892e;
    public boolean h;
    public final Object f22893f = new Object();
    public final b9.d f22894n = new b9.d(new qb.a(this));

    @Override
    public final android.os.IBinder onBind(android.content.Intent r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WearAuthListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.f22889a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.f22889a)));
        }
        if (this.f22892e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f22892e = handlerThread.getLooper();
        }
        this.f22890b = new a9.g(this, this.f22892e);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.f22889a);
        this.f22891c = new a9.d(this);
    }

    @Override
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.f22889a)));
        }
        synchronized (this.f22893f) {
            this.h = true;
            a9.g gVar = this.f22890b;
            if (gVar != null) {
                gVar.getLooper().quit();
                gVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.f22889a)));
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
