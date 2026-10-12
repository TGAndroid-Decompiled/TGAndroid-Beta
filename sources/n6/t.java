package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements Handler.Callback {
    public final ya.c f16142a;
    public final com.google.android.gms.internal.cast.a0 f16146n;
    public final ArrayList f16143b = new ArrayList();
    public final ArrayList f16144c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f16145f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f16147r = new Object();

    public t(Looper looper, ya.c cVar) {
        this.f16142a = cVar;
        this.f16146n = new com.google.android.gms.internal.cast.a0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f16147r) {
            try {
                if (this.d.contains(lVar)) {
                    String valueOf = String.valueOf(lVar);
                    Log.w("GmsClientEvents", "registerConnectionFailedListener(): listener " + valueOf + " is already registered");
                } else {
                    this.d.add(lVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            com.google.android.gms.common.api.k kVar = (com.google.android.gms.common.api.k) message.obj;
            synchronized (this.f16147r) {
                try {
                    if (this.e && this.f16142a.B0() && this.f16143b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", i2.d.i(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
