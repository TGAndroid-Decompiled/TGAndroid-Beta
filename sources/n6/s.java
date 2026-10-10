package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final pb.c f16713a;
    public final com.google.android.gms.internal.cast.a0 f16718n;
    public final ArrayList f16714b = new ArrayList();
    public final ArrayList f16715c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f16716e = false;
    public final AtomicInteger f16717f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f16719r = new Object();

    public s(Looper looper, pb.c cVar) {
        this.f16713a = cVar;
        this.f16718n = new com.google.android.gms.internal.cast.a0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f16719r) {
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
            synchronized (this.f16719r) {
                try {
                    if (this.f16716e && this.f16713a.a0() && this.f16714b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", hg.c.h(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
