package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final ya.c f15851a;
    public final com.google.android.gms.internal.cast.a0 f15855n;
    public final ArrayList f15852b = new ArrayList();
    public final ArrayList f15853c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f15854f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f15856r = new Object();

    public s(Looper looper, ya.c cVar) {
        this.f15851a = cVar;
        this.f15855n = new com.google.android.gms.internal.cast.a0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f15856r) {
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
            synchronized (this.f15856r) {
                try {
                    if (this.e && this.f15851a.y0() && this.f15852b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", i2.d.j(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
