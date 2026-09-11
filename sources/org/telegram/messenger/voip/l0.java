package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.nl;
public final class l0 implements Runnable {
    public final int f19394a;
    public final int f19395b;
    public final boolean f19396c;
    public final Object d;
    public final Object f19397e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19394a = i11;
        this.d = obj;
        this.f19397e = obj2;
        this.f19395b = i10;
        this.f19396c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(nl nlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19394a = 2;
        this.d = nlVar;
        this.f19396c = z10;
        this.f19397e = arrayList;
        this.f19395b = i10;
    }

    public l0(wv0 wv0Var, boolean z10, int i10, t1 t1Var) {
        this.f19394a = 5;
        this.d = wv0Var;
        this.f19396c = z10;
        this.f19395b = i10;
        this.f19397e = t1Var;
    }

    public l0(v51 v51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19394a = i11;
        this.d = v51Var;
        this.f19395b = i10;
        this.f19397e = tL_messages_searchGlobal;
        this.f19396c = z10;
    }
}
