package defpackage;

import android.os.SystemClock;
import org.telegram.ui.Components.q;
public final class po5 implements Runnable {
    public final byte a;
    public final q b;

    public po5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override
    public final void run() {
        tl9 tl9Var;
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                tl9 tl9Var2 = qVar.S;
                if (tl9Var2 != null && tl9Var2.a == 3) {
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
                ul9 ul9Var = qVar.Q;
                if (ul9Var != null && (tl9Var = qVar.S) != null) {
                    if (tl9Var.a == 3) {
                        qVar.r();
                        return;
                    } else if (tl9Var.e) {
                        ul9Var.p();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
