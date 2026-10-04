package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.jl;
public final class m0 implements Runnable {
    public final int f19577a;
    public final int f19578b;
    public final boolean f19579c;
    public final Object d;
    public final Object f19580e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19577a = i11;
        this.d = obj;
        this.f19580e = obj2;
        this.f19578b = i10;
        this.f19579c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19577a = 2;
        this.d = jlVar;
        this.f19579c = z10;
        this.f19580e = arrayList;
        this.f19578b = i10;
    }

    public m0(tw0 tw0Var, boolean z10, int i10, u1 u1Var) {
        this.f19577a = 5;
        this.d = tw0Var;
        this.f19579c = z10;
        this.f19578b = i10;
        this.f19580e = u1Var;
    }

    public m0(u61 u61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19577a = i11;
        this.d = u61Var;
        this.f19578b = i10;
        this.f19580e = tL_messages_searchGlobal;
        this.f19579c = z10;
    }
}
