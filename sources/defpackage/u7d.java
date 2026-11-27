package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class u7d implements Handler.Callback {
    public final pq8 a;
    public final b99 n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public u7d(Looper looper, pq8 pq8Var) {
        this.a = pq8Var;
        this.n = new b99(looper, this);
    }

    public final void a(l05 l05Var) {
        xve.h(l05Var);
        synchronized (this.r) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(l05Var)) {
                String valueOf = String.valueOf(l05Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                arrayList.add(l05Var);
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            k05 k05Var = (k05) message.obj;
            synchronized (this.r) {
                if (this.e && this.a.s() && this.b.contains(k05Var)) {
                    k05Var.onConnected(null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
