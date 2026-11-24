package defpackage;

import android.os.SystemClock;
import org.telegram.ui.Components.q;
public final class pq5 implements Runnable {
    public final byte a;
    public final q b;

    public pq5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override
    public final void run() {
        tn9 tn9Var;
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                tn9 tn9Var2 = qVar.S;
                if (tn9Var2 != null && tn9Var2.a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j = qVar.I0;
                    if (j == 0 || elapsedRealtimeNanos - j >= 70000000) {
                        qVar.B();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i = q.N0;
                qVar.k();
                return;
            default:
                int i2 = q.N0;
                un9 un9Var = qVar.Q;
                if (un9Var != null && (tn9Var = qVar.S) != null) {
                    if (tn9Var.a == 3) {
                        qVar.r();
                        return;
                    } else if (tn9Var.e) {
                        un9Var.p();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
