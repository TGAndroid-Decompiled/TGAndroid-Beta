package org.telegram.messenger;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.TLRPC;
public final class s3 implements Runnable {
    public final u3 f17870a;

    public s3(u3 u3Var) {
        this.f17870a = u3Var;
    }

    @Override
    public final void run() {
        int i10;
        u3 u3Var = this.f17870a;
        a0.h hVar = u3Var.P;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < hVar.m()) {
            long j10 = hVar.j(i11);
            if (uptimeMillis - ((TLRPC.GroupCallParticipant) hVar.f(j10)).lastSpeakTime >= 500) {
                hVar.l(j10);
                String str = null;
                if (j10 > 0) {
                    TLRPC.User Z1 = vp.r1(u3Var.C.f14863a).Z1(Long.valueOf(j10));
                    StringBuilder s10 = a1.g.s(j10, "remove from speaking ", " ");
                    if (Z1 != null) {
                        str = Z1.first_name;
                    }
                    s10.append(str);
                    Log.d("GroupCall", s10.toString());
                    i10 = i11;
                } else {
                    i10 = i11;
                    TLRPC.Chat L0 = vp.r1(u3Var.C.f14863a).L0(Long.valueOf(-j10));
                    StringBuilder s11 = a1.g.s(j10, "remove from speaking ", " ");
                    if (L0 != null) {
                        str = L0.title;
                    }
                    s11.append(str);
                    Log.d("GroupCall", s11.toString());
                }
                i11 = i10 - 1;
                z10 = true;
            }
            i11++;
        }
        if (hVar.m() > 0) {
            i0.h3(u3Var.Q, 550L);
        }
        if (z10) {
            zs.f(u3Var.C.f14863a).k(zs.f19727y2, Long.valueOf(u3Var.f18229c), Long.valueOf(u3Var.f18228b.f19803id), Boolean.FALSE);
        }
    }
}
