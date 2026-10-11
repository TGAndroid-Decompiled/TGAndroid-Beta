package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements Handler.Callback {
    public final pb.c f16758a;
    public final com.google.android.gms.internal.cast.a0 f16763n;
    public final ArrayList f16759b = new ArrayList();
    public final ArrayList f16760c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f16761e = false;
    public final AtomicInteger f16762f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f16764r = new Object();

    public t(Looper looper, pb.c cVar) {
        this.f16758a = cVar;
        this.f16763n = new com.google.android.gms.internal.cast.a0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.h(lVar);
        synchronized (this.f16764r) {
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
            synchronized (this.f16764r) {
                try {
                    if (this.f16761e && this.f16758a.a0() && this.f16759b.contains(kVar)) {
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
