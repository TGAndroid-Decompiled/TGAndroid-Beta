package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.nl;
public final class p0 implements Runnable {
    public final int f18851a;
    public final int f18852b;
    public final boolean f18853c;
    public final Object d;
    public final Object e;

    public p0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f18851a = i11;
        this.d = obj;
        this.e = obj2;
        this.f18852b = i10;
        this.f18853c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.p0.run():void");
    }

    public p0(nl nlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f18851a = 2;
        this.d = nlVar;
        this.f18853c = z10;
        this.e = arrayList;
        this.f18852b = i10;
    }

    public p0(dv0 dv0Var, boolean z10, int i10, q1 q1Var) {
        this.f18851a = 5;
        this.d = dv0Var;
        this.f18853c = z10;
        this.f18852b = i10;
        this.e = q1Var;
    }

    public p0(q51 q51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18851a = i11;
        this.d = q51Var;
        this.f18852b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18853c = z10;
    }
}
