package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements Handler.Callback {
    public final a6.m f16461a;
    public final com.google.android.gms.internal.cast.a0 f16466n;
    public final ArrayList f16462b = new ArrayList();
    public final ArrayList f16463c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f16464e = false;
    public final AtomicInteger f16465f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f16467r = new Object();

    public t(Looper looper, a6.m mVar) {
        this.f16461a = mVar;
        this.f16466n = new com.google.android.gms.internal.cast.a0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.h(lVar);
        synchronized (this.f16467r) {
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
            synchronized (this.f16467r) {
                try {
                    if (this.f16464e && this.f16461a.e0() && this.f16462b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", hg.c.i(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
