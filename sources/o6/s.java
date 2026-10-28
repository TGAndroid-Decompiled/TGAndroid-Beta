package o6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements Handler.Callback {
    public final a4.l f19174a;
    public final com.google.android.gms.internal.cast.y f19178n;
    public final ArrayList f19175b = new ArrayList();
    public final ArrayList f19176c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f19177f = new AtomicInteger(0);
    public boolean h = false;
    public final Object f19179r = new Object();

    public s(Looper looper, a4.l lVar) {
        this.f19174a = lVar;
        this.f19178n = new com.google.android.gms.internal.cast.y(looper, this);
    }

    public final void a(com.google.android.gms.common.api.l lVar) {
        l.h(lVar);
        synchronized (this.f19179r) {
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
            synchronized (this.f19179r) {
                try {
                    if (this.e && this.f19174a.w() && this.f19175b.contains(kVar)) {
                        kVar.onConnected(null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", ic.a.i(i10, "Don't know how to handle message: "), new Exception());
        return false;
    }
}
