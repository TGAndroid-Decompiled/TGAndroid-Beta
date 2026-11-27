package defpackage;

import android.os.SystemClock;
import org.telegram.ui.Components.q;
public final class sq5 implements Runnable {
    public final byte a;
    public final q b;

    public sq5(q qVar, byte b) {
        this.a = b;
        this.b = qVar;
    }

    @Override
    public final void run() {
        ip9 ip9Var;
        byte b = this.a;
        q qVar = this.b;
        switch (b) {
            case 0:
                ip9 ip9Var2 = qVar.S;
                if (ip9Var2 != null && ip9Var2.a == 3) {
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
                jp9 jp9Var = qVar.Q;
                if (jp9Var != null && (ip9Var = qVar.S) != null) {
                    if (ip9Var.a == 3) {
                        qVar.r();
                        return;
                    } else if (ip9Var.e) {
                        jp9Var.p();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
