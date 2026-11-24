package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class d3d implements Handler.Callback {
    public final ny4 a;
    public final o59 n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public d3d(Looper looper, ny4 ny4Var) {
        this.a = ny4Var;
        this.n = new o59(looper, this);
    }

    public final void a(fy4 fy4Var) {
        fre.h(fy4Var);
        synchronized (this.r) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(fy4Var)) {
                String valueOf = String.valueOf(fy4Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                arrayList.add(fy4Var);
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ey4 ey4Var = (ey4) message.obj;
            synchronized (this.r) {
                if (this.e && this.a.a() && this.b.contains(ey4Var)) {
                    ey4Var.onConnected(null);
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
