package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
public final class f5d implements Handler.Callback {
    public final et8 a;
    public final q79 n;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean h = false;
    public final Object r = new Object();

    public f5d(Looper looper, et8 et8Var) {
        this.a = et8Var;
        this.n = new q79(looper, this);
    }

    public final void a(g05 g05Var) {
        ite.h(g05Var);
        synchronized (this.r) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(g05Var)) {
                String valueOf = String.valueOf(g05Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                arrayList.add(g05Var);
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            f05 f05Var = (f05) message.obj;
            synchronized (this.r) {
                if (this.e && this.a.q() && this.b.contains(f05Var)) {
                    f05Var.onConnected(null);
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
