package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;
public final class r3 implements Runnable {
    public final t3 f26537a;

    public r3(t3 t3Var) {
        this.f26537a = t3Var;
    }

    @Override
    public final void run() {
        int i7;
        t3 t3Var = this.f26537a;
        a0.h hVar = t3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < hVar.m()) {
            long j3 = hVar.j(i10);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j3)).lastSpeakTime >= 500) {
                hVar.l(j3);
                String str = null;
                if (j3 > 0) {
                    TLRPC.User c22 = mp.u1(t3Var.C.f23218a).c2(Long.valueOf(j3));
                    StringBuilder t6 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (c22 != null) {
                        str = c22.first_name;
                    }
                    p5.c.t(t6, str, "GroupCall");
                    i7 = i10;
                } else {
                    i7 = i10;
                    TLRPC.Chat O0 = mp.u1(t3Var.C.f23218a).O0(Long.valueOf(-j3));
                    StringBuilder t10 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (O0 != null) {
                        str = O0.title;
                    }
                    p5.c.t(t10, str, "GroupCall");
                }
                i10 = i7 - 1;
                z10 = true;
            }
            i10++;
        }
        if (hVar.m() > 0) {
            g0.h3(t3Var.Q, 550L);
        }
        if (z10) {
            ks.f(t3Var.C.f23218a).k(ks.f25227y2, Long.valueOf(t3Var.f26936c), Long.valueOf(t3Var.f26935b.f28413id), Boolean.FALSE);
        }
    }
}
