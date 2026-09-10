package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.pl;
public final class o0 implements Runnable {
    public final int f16762a;
    public final int f16763b;
    public final boolean f16764c;
    public final Object d;
    public final Object e;

    public o0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f16762a = i11;
        this.d = obj;
        this.e = obj2;
        this.f16763b = i10;
        this.f16764c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.o0.run():void");
    }

    public o0(pl plVar, boolean z10, ArrayList arrayList, int i10) {
        this.f16762a = 2;
        this.d = plVar;
        this.f16764c = z10;
        this.e = arrayList;
        this.f16763b = i10;
    }

    public o0(iw0 iw0Var, boolean z10, int i10, t1 t1Var) {
        this.f16762a = 5;
        this.d = iw0Var;
        this.f16764c = z10;
        this.f16763b = i10;
        this.e = t1Var;
    }

    public o0(j61 j61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f16762a = i11;
        this.d = j61Var;
        this.f16763b = i10;
        this.e = tL_messages_searchGlobal;
        this.f16764c = z10;
    }
}
