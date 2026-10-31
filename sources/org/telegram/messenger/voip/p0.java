package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.nl;
public final class p0 implements Runnable {
    public final int f18691a;
    public final int f18692b;
    public final boolean f18693c;
    public final Object d;
    public final Object e;

    public p0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f18691a = i11;
        this.d = obj;
        this.e = obj2;
        this.f18692b = i10;
        this.f18693c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.p0.run():void");
    }

    public p0(nl nlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f18691a = 2;
        this.d = nlVar;
        this.f18693c = z10;
        this.e = arrayList;
        this.f18692b = i10;
    }

    public p0(cv0 cv0Var, boolean z10, int i10, q1 q1Var) {
        this.f18691a = 5;
        this.d = cv0Var;
        this.f18693c = z10;
        this.f18692b = i10;
        this.e = q1Var;
    }

    public p0(p51 p51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18691a = i11;
        this.d = p51Var;
        this.f18692b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18693c = z10;
    }
}
