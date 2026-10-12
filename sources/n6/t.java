package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements Handler.Callback {
    public final a6.m f16462a;
    public final com.google.android.gms.internal.cast.a0 f16467n;
    public final ArrayList f16463b = new ArrayList();
    public final ArrayList f16464c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f16465e = false;
    public final AtomicInteger f16466f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f16468r = new Object();

    public t(Looper looper, a6.m mVar) {
        this.f16462a = mVar;
        this.f16467n = new com.google.android.gms.internal.cast.a0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.h(lVar);
        synchronized (this.f16468r) {
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
            synchronized (this.f16468r) {
                try {
                    if (this.f16465e && this.f16462a.e0() && this.f16463b.contains(kVar)) {
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
