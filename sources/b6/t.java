package b6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements Handler.Callback {
    public final ja.c f1776a;
    public final a7.e f1781n;
    public final ArrayList f1777b = new ArrayList();
    public final ArrayList f1778c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean f1779e = false;
    public final AtomicInteger f1780f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f1782r = new Object();

    public t(Looper looper, ja.c cVar) {
        this.f1776a = cVar;
        this.f1781n = new a7.e(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        m.h(lVar);
        synchronized (this.f1782r) {
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
            synchronized (this.f1782r) {
                try {
                    if (this.f1779e && this.f1776a.C() && this.f1777b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", l.d.j(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
