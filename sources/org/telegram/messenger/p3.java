package org.telegram.messenger;

import android.os.SystemClock;
import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final r3 f25890a;

    public p3(r3 r3Var) {
        this.f25890a = r3Var;
    }

    @Override
    public final void run() {
        int i7;
        r3 r3Var = this.f25890a;
        a0.h hVar = r3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < hVar.m()) {
            long j3 = hVar.j(i10);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j3)).lastSpeakTime >= 500) {
                hVar.l(j3);
                String str = null;
                if (j3 > 0) {
                    TLRPC.User a22 = np.s1(r3Var.C.f22778a).a2(Long.valueOf(j3));
                    StringBuilder t6 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (a22 != null) {
                        str = a22.first_name;
                    }
                    r.b.t(t6, str, "GroupCall");
                    i7 = i10;
                } else {
                    i7 = i10;
                    TLRPC.Chat M0 = np.s1(r3Var.C.f22778a).M0(Long.valueOf(-j3));
                    StringBuilder t10 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (M0 != null) {
                        str = M0.title;
                    }
                    r.b.t(t10, str, "GroupCall");
                }
                i10 = i7 - 1;
                z10 = true;
            }
            i10++;
        }
        if (hVar.m() > 0) {
            g0.i3(r3Var.Q, 550L);
        }
        if (z10) {
            ns.f(r3Var.C.f22778a).k(ns.f25609y2, Long.valueOf(r3Var.f26209c), Long.valueOf(r3Var.f26208b.f28061id), Boolean.FALSE);
        }
    }
}
