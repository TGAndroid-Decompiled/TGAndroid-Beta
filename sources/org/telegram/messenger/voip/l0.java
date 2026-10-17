package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.hl;
public final class l0 implements Runnable {
    public final int f19876a;
    public final int f19877b;
    public final boolean f19878c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19876a = i11;
        this.d = obj;
        this.e = obj2;
        this.f19877b = i10;
        this.f19878c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(hl hlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19876a = 2;
        this.d = hlVar;
        this.f19878c = z10;
        this.e = arrayList;
        this.f19877b = i10;
    }

    public l0(rw0 rw0Var, boolean z10, int i10, u1 u1Var) {
        this.f19876a = 5;
        this.d = rw0Var;
        this.f19878c = z10;
        this.f19877b = i10;
        this.e = u1Var;
    }

    public l0(s61 s61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19876a = i11;
        this.d = s61Var;
        this.f19877b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19878c = z10;
    }
}
