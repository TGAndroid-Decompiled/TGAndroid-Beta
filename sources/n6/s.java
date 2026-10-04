package n6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final a4.m f16739a;
    public final com.google.android.gms.internal.cast.c0 f16744n;
    public final ArrayList f16740b = new ArrayList();
    public final ArrayList f16741c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f16742e = false;
    public final AtomicInteger f16743f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f16745r = new Object();

    public s(Looper looper, a4.m mVar) {
        this.f16739a = mVar;
        this.f16744n = new com.google.android.gms.internal.cast.c0(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f16745r) {
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
            synchronized (this.f16745r) {
                try {
                    if (this.f16742e && this.f16739a.z0() && this.f16740b.contains(kVar)) {
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
