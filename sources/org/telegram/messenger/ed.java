package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x80;
public final class ed implements Runnable {
    public final int f15550a;
    public final int f15551b;
    public final long f15552c;
    public final Object d;

    public ed(Object obj, int i10, long j10, int i11) {
        this.f15550a = i11;
        this.d = obj;
        this.f15551b = i10;
        this.f15552c = j10;
    }

    private final void a() {
        int i10;
        c cVar = (c) this.d;
        rz C = rz.C(cVar.f15043a);
        ArrayList arrayList = (ArrayList) C.f18004a.get("group_" + this.f15552c);
        if (arrayList != null && !arrayList.isEmpty()) {
            dz dzVar = (dz) arrayList.get(0);
            kj kjVar = (kj) i0.a.g(1, dzVar.f15482x);
            dzVar.G = kjVar.f1();
            kjVar.f16690k.params.put("final", "1");
            TLRPC.TL_messages_messages tL_messages_messages = new TLRPC.TL_messages_messages();
            tL_messages_messages.messages.add(kjVar.f16690k);
            if (!dzVar.I && !dzVar.J) {
                is a02 = is.a0(cVar.f15043a);
                long j10 = dzVar.f15463a;
                if (this.f15551b != 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                a02.h1(-2, 0, i10, j10, 0L, tL_messages_messages, false);
            }
            C.t0(dzVar, true);
        }
    }

    private final void b() {
        m4.c cVar = ((org.telegram.ui.Cells.q1) this.d).Vb;
        if (cVar != null) {
            int i10 = this.f15551b;
            if (i10 > 0) {
                i10 = ((SparseIntArray) cVar.f12707c).get(i10, 0);
            }
            if (i10 != 0) {
                ((l2.f) cVar.f12706b).P(this.f15552c, 0L, i10);
            }
        }
    }

    private final void c() {
        Long l4 = (Long) this.d;
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T != null) {
            org.telegram.ui.un ma2 = org.telegram.ui.un.ma(l4.longValue());
            T.presentFragment(ma2);
            TLRPC.Chat L0 = wp.r1(this.f15551b).L0(Long.valueOf(-l4.longValue()));
            if (L0 != null) {
                i0.h3(new x80(ma2, this.f15552c, L0, 1), 250L);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ed.run():void");
    }

    public ed(Object obj, long j10, int i10, int i11) {
        this.f15550a = i11;
        this.d = obj;
        this.f15552c = j10;
        this.f15551b = i10;
    }
}
