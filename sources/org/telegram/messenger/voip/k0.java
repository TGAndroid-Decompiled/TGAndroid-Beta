package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.gl;
public final class k0 implements Runnable {
    public final int f19955a;
    public final int f19956b;
    public final boolean f19957c;
    public final Object d;
    public final Object e;

    public k0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19955a = i11;
        this.d = obj;
        this.e = obj2;
        this.f19956b = i10;
        this.f19957c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.k0.run():void");
    }

    public k0(gl glVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19955a = 2;
        this.d = glVar;
        this.f19957c = z10;
        this.e = arrayList;
        this.f19956b = i10;
    }

    public k0(vw0 vw0Var, boolean z10, int i10, t1 t1Var) {
        this.f19955a = 5;
        this.d = vw0Var;
        this.f19957c = z10;
        this.f19956b = i10;
        this.e = t1Var;
    }

    public k0(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19955a = i11;
        this.d = a71Var;
        this.f19956b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19957c = z10;
    }
}
