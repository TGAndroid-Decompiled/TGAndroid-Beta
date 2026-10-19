package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final a6.i f17232a;
    public final com.google.android.gms.internal.cast.a0 f17236n;
    public final ArrayList f17233b = new ArrayList();
    public final ArrayList f17234c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f17235f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f17237r = new Object();

    public s(Looper looper, a6.i iVar) {
        this.f17232a = iVar;
        this.f17236n = new com.google.android.gms.internal.cast.a0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f17237r) {
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
            synchronized (this.f17237r) {
                try {
                    if (this.e && this.f17232a.B() && this.f17233b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", i2.e.j(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
