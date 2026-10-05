package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.jl;
public final class m0 implements Runnable {
    public final int f19582a;
    public final int f19583b;
    public final boolean f19584c;
    public final Object d;
    public final Object f19585e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19582a = i11;
        this.d = obj;
        this.f19585e = obj2;
        this.f19583b = i10;
        this.f19584c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19582a = 2;
        this.d = jlVar;
        this.f19584c = z10;
        this.f19585e = arrayList;
        this.f19583b = i10;
    }

    public m0(uw0 uw0Var, boolean z10, int i10, u1 u1Var) {
        this.f19582a = 5;
        this.d = uw0Var;
        this.f19584c = z10;
        this.f19583b = i10;
        this.f19585e = u1Var;
    }

    public m0(w61 w61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19582a = i11;
        this.d = w61Var;
        this.f19583b = i10;
        this.f19585e = tL_messages_searchGlobal;
        this.f19584c = z10;
    }
}
