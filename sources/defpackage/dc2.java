package defpackage;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;
public final class dc2 implements Runnable {
    public final fc2 a;

    public dc2(fc2 fc2Var) {
        this.a = fc2Var;
    }

    @Override
    public final void run() {
        int i;
        fc2 fc2Var = this.a;
        vf6 vf6Var = fc2Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = 0;
        boolean z = false;
        while (i2 < vf6Var.m()) {
            long j = vf6Var.j(i2);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) vf6Var.f(j)).lastSpeakTime >= 500) {
                vf6Var.l(j);
                int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                j5 j5Var = fc2Var.C;
                String str = null;
                if (i3 > 0) {
                    TLRPC.User V1 = na7.q1(j5Var.a).V1(Long.valueOf(j));
                    StringBuilder o = ug8.o(j, "remove from speaking ", " ");
                    if (V1 != null) {
                        str = V1.first_name;
                    }
                    ir2.x(o, str, "GroupCall");
                    i = i2;
                } else {
                    i = i2;
                    TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(-j));
                    StringBuilder o2 = ug8.o(j, "remove from speaking ", " ");
                    if (K0 != null) {
                        str = K0.title;
                    }
                    ir2.x(o2, str, "GroupCall");
                }
                i2 = i - 1;
                z = true;
            }
            i2++;
        }
        if (vf6Var.m() > 0) {
            gl.e3(fc2Var.Q, 550L);
        }
        if (z) {
            kk7.f(fc2Var.C.a).k(kk7.x2, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
        }
    }
}
