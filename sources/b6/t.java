package b6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements Handler.Callback {
    public final ja.c f1653a;
    public final a7.e f1657n;
    public final ArrayList f1654b = new ArrayList();
    public final ArrayList f1655c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f1656f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f1658r = new Object();

    public t(Looper looper, ja.c cVar) {
        this.f1653a = cVar;
        this.f1657n = new a7.e(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.h(lVar);
        synchronized (this.f1658r) {
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
            synchronized (this.f1658r) {
                try {
                    if (this.e && this.f1653a.l() && this.f1654b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", kf.k0.j(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
