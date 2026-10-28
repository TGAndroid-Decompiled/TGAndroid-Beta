package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.jl;
public final class j0 implements Runnable {
    public final int f21640a;
    public final int f21641b;
    public final boolean f21642c;
    public final Object d;
    public final Object e;

    public j0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f21640a = i11;
        this.d = obj;
        this.e = obj2;
        this.f21641b = i10;
        this.f21642c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.j0.run():void");
    }

    public j0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f21640a = 2;
        this.d = jlVar;
        this.f21642c = z10;
        this.e = arrayList;
        this.f21641b = i10;
    }

    public j0(ex0 ex0Var, boolean z10, int i10, s1 s1Var) {
        this.f21640a = 5;
        this.d = ex0Var;
        this.f21642c = z10;
        this.f21641b = i10;
        this.e = s1Var;
    }

    public j0(k71 k71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f21640a = i11;
        this.d = k71Var;
        this.f21641b = i10;
        this.e = tL_messages_searchGlobal;
        this.f21642c = z10;
    }
}
