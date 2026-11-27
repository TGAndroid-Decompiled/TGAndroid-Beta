package defpackage;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;
public final class tc2 implements Runnable {
    public final vc2 a;

    public tc2(vc2 vc2Var) {
        this.a = vc2Var;
    }

    @Override
    public final void run() {
        int i;
        vc2 vc2Var = this.a;
        zh6 zh6Var = vc2Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i2 = 0;
        boolean z = false;
        while (i2 < zh6Var.m()) {
            long j = zh6Var.j(i2);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) zh6Var.f(j)).lastSpeakTime >= 500) {
                zh6Var.l(j);
                int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                k5 k5Var = vc2Var.C;
                String str = null;
                if (i3 > 0) {
                    TLRPC.User X1 = uc7.s1(k5Var.a).X1(Long.valueOf(j));
                    StringBuilder o = ik8.o(j, "remove from speaking ", " ");
                    if (X1 != null) {
                        str = X1.first_name;
                    }
                    bs2.x(o, str, "GroupCall");
                    i = i2;
                } else {
                    i = i2;
                    TLRPC.Chat M0 = uc7.s1(k5Var.a).M0(Long.valueOf(-j));
                    StringBuilder o2 = ik8.o(j, "remove from speaking ", " ");
                    if (M0 != null) {
                        str = M0.title;
                    }
                    bs2.x(o2, str, "GroupCall");
                }
                i2 = i - 1;
                z = true;
            }
            i2++;
        }
        if (zh6Var.m() > 0) {
            hl.d3(vc2Var.Q, 550L);
        }
        if (z) {
            jn7.f(vc2Var.C.a).k(jn7.y2, Long.valueOf(vc2Var.c), Long.valueOf(vc2Var.b.id), Boolean.FALSE);
        }
    }
}
