package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final r3 f24515a;

    public p3(r3 r3Var) {
        this.f24515a = r3Var;
    }

    @Override
    public final void run() {
        int i7;
        r3 r3Var = this.f24515a;
        a0.h hVar = r3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = 0;
        boolean z9 = false;
        while (i10 < hVar.m()) {
            long j3 = hVar.j(i10);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j3)).lastSpeakTime >= 500) {
                hVar.l(j3);
                String str = null;
                if (j3 > 0) {
                    TLRPC.User a22 = qp.s1(r3Var.C.f21770a).a2(Long.valueOf(j3));
                    StringBuilder t6 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (a22 != null) {
                        str = a22.first_name;
                    }
                    rf.b.p(t6, str, "GroupCall");
                    i7 = i10;
                } else {
                    i7 = i10;
                    TLRPC.Chat M0 = qp.s1(r3Var.C.f21770a).M0(Long.valueOf(-j3));
                    StringBuilder t10 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (M0 != null) {
                        str = M0.title;
                    }
                    rf.b.p(t10, str, "GroupCall");
                }
                i10 = i7 - 1;
                z9 = true;
            }
            i10++;
        }
        if (hVar.m() > 0) {
            g0.i3(r3Var.Q, 550L);
        }
        if (z9) {
            qs.f(r3Var.C.f21770a).k(qs.f25117y2, Long.valueOf(r3Var.f25227c), Long.valueOf(r3Var.f25226b.f26970id), Boolean.FALSE);
        }
    }
}
