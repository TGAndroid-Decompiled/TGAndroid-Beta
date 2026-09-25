package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.jl;
public final class l0 implements Runnable {
    public final int f17916a;
    public final int f17917b;
    public final boolean f17918c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f17916a = i11;
        this.d = obj;
        this.e = obj2;
        this.f17917b = i10;
        this.f17918c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f17916a = 2;
        this.d = jlVar;
        this.f17918c = z10;
        this.e = arrayList;
        this.f17917b = i10;
    }

    public l0(iw0 iw0Var, boolean z10, int i10, u1 u1Var) {
        this.f17916a = 5;
        this.d = iw0Var;
        this.f17918c = z10;
        this.f17917b = i10;
        this.e = u1Var;
    }

    public l0(j61 j61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17916a = i11;
        this.d = j61Var;
        this.f17917b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17918c = z10;
    }
}
