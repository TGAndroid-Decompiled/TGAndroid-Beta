package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final a6.i f16591a;
    public final com.google.android.gms.internal.cast.c0 f16596n;
    public final ArrayList f16592b = new ArrayList();
    public final ArrayList f16593c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f16594e = false;
    public final AtomicInteger f16595f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f16597r = new Object();

    public s(Looper looper, a6.i iVar) {
        this.f16591a = iVar;
        this.f16596n = new com.google.android.gms.internal.cast.c0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f16597r) {
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
            synchronized (this.f16597r) {
                try {
                    if (this.f16594e && this.f16591a.t() && this.f16592b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", i2.g.i(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
