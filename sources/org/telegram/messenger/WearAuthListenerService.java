package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
public class WearAuthListenerService extends Service implements og1 {
    public static final int r = 0;
    public ComponentName a;
    public l7f b;
    public x9d c;
    public Intent d;
    public Looper e;
    public boolean h;
    public final Object f = new Object();
    public final sgd n = new sgd(new Object());

    @Override
    public final android.os.IBinder onBind(android.content.Intent r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.WearAuthListenerService.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        this.a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.a)));
        }
        Looper looper = this.e;
        if (looper == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            looper = handlerThread.getLooper();
            this.e = looper;
        }
        this.b = new l7f(this, looper);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.a);
        this.c = new x9d(this);
    }

    @Override
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.a)));
        }
        synchronized (this.f) {
            this.h = true;
            l7f l7fVar = this.b;
            if (l7fVar != null) {
                l7fVar.getLooper().quit();
                l7fVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.a)));
            }
        }
        super.onDestroy();
    }

    @Override
    public final void a(fjd fjdVar) {
    }

    @Override
    public final void b(fjd fjdVar) {
    }

    @Override
    public final void c(fjd fjdVar) {
    }

    @Override
    public final void d(fjd fjdVar) {
    }
}
