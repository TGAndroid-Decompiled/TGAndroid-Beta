package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y80;
public final class dd implements Runnable {
    public final int f15220a;
    public final int f15221b;
    public final long f15222c;
    public final Object d;

    public dd(Object obj, int i10, long j10, int i11) {
        this.f15220a = i11;
        this.d = obj;
        this.f15221b = i10;
        this.f15222c = j10;
    }

    private final void a() {
        int i10;
        c cVar = (c) this.d;
        qz C = qz.C(cVar.f14863a);
        ArrayList arrayList = (ArrayList) C.f17658a.get("group_" + this.f15222c);
        if (arrayList != null && !arrayList.isEmpty()) {
            cz czVar = (cz) arrayList.get(0);
            jj jjVar = (jj) i0.a.g(1, czVar.f15126x);
            czVar.G = jjVar.f1();
            jjVar.f16337k.params.put("final", "1");
            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
            tL_messages_messages.messages.add(jjVar.f16337k);
            if (!czVar.I && !czVar.J) {
                hs a02 = hs.a0(cVar.f14863a);
                long j10 = czVar.f15107a;
                if (this.f15221b != 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                a02.h1(-2, 0, i10, j10, 0L, tL_messages_messages, false);
            }
            C.t0(czVar, true);
        }
    }

    private final void b() {
        m4.c cVar = ((org.telegram.ui.Cells.q1) this.d).Vb;
        if (cVar != null) {
            int i10 = this.f15221b;
            if (i10 > 0) {
                i10 = ((SparseIntArray) cVar.f12706c).get(i10, 0);
            }
            if (i10 != 0) {
                ((l2.f) cVar.f12705b).P(this.f15222c, 0L, i10);
            }
        }
    }

    private final void c() {
        Long l4 = (Long) this.d;
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.un ha = org.telegram.ui.un.ha(l4.longValue());
            T.presentFragment(ha);
            TLRPC.Chat L0 = vp.r1(this.f15221b).L0(Long.valueOf(-l4.longValue()));
            if (L0 != null) {
                i0.h3(new y80(ha, this.f15222c, L0, 1), 250L);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dd.run():void");
    }

    public dd(Object obj, long j10, int i10, int i11) {
        this.f15220a = i11;
        this.d = obj;
        this.f15222c = j10;
        this.f15221b = i10;
    }
}
