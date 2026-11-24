package org.telegram.messenger;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
public class WearAuthListenerService extends Service implements fg1 {
    public static final int r = 0;
    public ComponentName a;
    public u2f b;
    public e5d c;
    public Intent d;
    public Looper e;
    public boolean h;
    public final Object f = new Object();
    public final zbd n = new zbd(new Object());

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
        this.b = new u2f(this, looper);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.d = intent;
        intent.setComponent(this.a);
        this.c = new e5d(this);
    }

    @Override
    public final void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.a)));
        }
        synchronized (this.f) {
            this.h = true;
            u2f u2fVar = this.b;
            if (u2fVar != null) {
                u2fVar.getLooper().quit();
                u2fVar.a("quit");
            } else {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.a)));
            }
        }
        super.onDestroy();
    }

    @Override
    public final void a(oed oedVar) {
    }

    @Override
    public final void b(oed oedVar) {
    }

    @Override
    public final void c(oed oedVar) {
    }

    @Override
    public final void d(oed oedVar) {
    }
}
