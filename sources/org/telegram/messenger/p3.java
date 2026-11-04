package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.TLRPC;
public final class p3 implements Runnable {
    public final r3 f24697a;

    public p3(r3 r3Var) {
        this.f24697a = r3Var;
    }

    @Override
    public final void run() {
        int i3;
        r3 r3Var = this.f24697a;
        a0.h hVar = r3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < hVar.m()) {
            long j10 = hVar.j(i10);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j10)).lastSpeakTime >= 500) {
                hVar.l(j10);
                String str = null;
                if (j10 > 0) {
                    TLRPC.User a22 = hp.s1(r3Var.C.f21919a).a2(Long.valueOf(j10));
                    StringBuilder t10 = a1.g.t(j10, "remove from speaking ", " ");
                    if (a22 != null) {
                        str = a22.first_name;
                    }
                    t10.append(str);
                    Log.d("GroupCall", t10.toString());
                    i3 = i10;
                } else {
                    i3 = i10;
                    TLRPC.Chat M0 = hp.s1(r3Var.C.f21919a).M0(Long.valueOf(-j10));
                    StringBuilder t11 = a1.g.t(j10, "remove from speaking ", " ");
                    if (M0 != null) {
                        str = M0.title;
                    }
                    t11.append(str);
                    Log.d("GroupCall", t11.toString());
                }
                i10 = i3 - 1;
                z10 = true;
            }
            i10++;
        }
        if (hVar.m() > 0) {
            g0.i3(r3Var.Q, 550L);
        }
        if (z10) {
            hs.f(r3Var.C.f21919a).k(hs.f23342y2, Long.valueOf(r3Var.f25050c), Long.valueOf(r3Var.f25049b.f27011id), Boolean.FALSE);
        }
    }
}
