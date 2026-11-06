package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final r3 f24500a;

    public p3(r3 r3Var) {
        this.f24500a = r3Var;
    }

    @Override
    public final void run() {
        int i7;
        r3 r3Var = this.f24500a;
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
                    TLRPC.User a22 = qp.s1(r3Var.C.f21723a).a2(Long.valueOf(j3));
                    StringBuilder t6 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (a22 != null) {
                        str = a22.first_name;
                    }
                    t6.append(str);
                    Log.d("GroupCall", t6.toString());
                    i7 = i10;
                } else {
                    i7 = i10;
                    TLRPC.Chat M0 = qp.s1(r3Var.C.f21723a).M0(Long.valueOf(-j3));
                    StringBuilder t10 = a8.p0.t(j3, "remove from speaking ", " ");
                    if (M0 != null) {
                        str = M0.title;
                    }
                    t10.append(str);
                    Log.d("GroupCall", t10.toString());
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
            qs.f(r3Var.C.f21723a).k(qs.f25096y2, Long.valueOf(r3Var.f25202c), Long.valueOf(r3Var.f25201b.f26962id), Boolean.FALSE);
        }
    }
}
