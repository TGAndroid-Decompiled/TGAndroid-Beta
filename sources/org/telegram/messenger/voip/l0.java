package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.rk;
public final class l0 implements Runnable {
    public final int f27149a;
    public final int f27150b;
    public final boolean f27151c;
    public final Object d;
    public final Object f27152e;

    public l0(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f27149a = i10;
        this.d = obj;
        this.f27152e = obj2;
        this.f27150b = i7;
        this.f27151c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(rk rkVar, boolean z10, ArrayList arrayList, int i7) {
        this.f27149a = 2;
        this.d = rkVar;
        this.f27151c = z10;
        this.f27152e = arrayList;
        this.f27150b = i7;
    }

    public l0(au0 au0Var, boolean z10, int i7, q1 q1Var) {
        this.f27149a = 5;
        this.d = au0Var;
        this.f27151c = z10;
        this.f27150b = i7;
        this.f27152e = q1Var;
    }

    public l0(p41 p41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27149a = i10;
        this.d = p41Var;
        this.f27150b = i7;
        this.f27152e = tL_messages_searchGlobal;
        this.f27151c = z10;
    }
}
