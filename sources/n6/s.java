package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final xa.c f13912a;
    public final com.google.android.gms.internal.cast.c0 f13916n;
    public final ArrayList f13913b = new ArrayList();
    public final ArrayList f13914c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f13915f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f13917r = new Object();

    public s(Looper looper, xa.c cVar) {
        this.f13912a = cVar;
        this.f13916n = new com.google.android.gms.internal.cast.c0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f13917r) {
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
            synchronized (this.f13917r) {
                try {
                    if (this.e && this.f13912a.z0() && this.f13913b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", hc.b.j(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
