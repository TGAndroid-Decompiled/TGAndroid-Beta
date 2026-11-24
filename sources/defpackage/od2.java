package defpackage;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;
public final class od2 implements Runnable {
    public final qd2 a;

    public od2(qd2 qd2Var) {
        this.a = qd2Var;
    }

    @Override
    public final void run() {
        int i;
        qd2 qd2Var = this.a;
        vh6 vh6Var = qd2Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = 0;
        boolean z = false;
        while (i2 < vh6Var.m()) {
            long j = vh6Var.j(i2);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) vh6Var.f(j)).lastSpeakTime >= 500) {
                vh6Var.l(j);
                int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                j5 j5Var = qd2Var.C;
                String str = null;
                if (i3 > 0) {
                    TLRPC.User W1 = oc7.r1(j5Var.a).W1(Long.valueOf(j));
                    StringBuilder o = wi8.o(j, "remove from speaking ", " ");
                    if (W1 != null) {
                        str = W1.first_name;
                    }
                    ts2.w(o, str, "GroupCall");
                    i = i2;
                } else {
                    i = i2;
                    TLRPC.Chat L0 = oc7.r1(j5Var.a).L0(Long.valueOf(-j));
                    StringBuilder o2 = wi8.o(j, "remove from speaking ", " ");
                    if (L0 != null) {
                        str = L0.title;
                    }
                    ts2.w(o2, str, "GroupCall");
                }
                i2 = i - 1;
                z = true;
            }
            i2++;
        }
        if (vh6Var.m() > 0) {
            gm.d3(qd2Var.Q, 550L);
        }
        if (z) {
            nm7.f(qd2Var.C.a).k(nm7.y2, Long.valueOf(qd2Var.c), Long.valueOf(qd2Var.b.id), Boolean.FALSE);
        }
    }
}
