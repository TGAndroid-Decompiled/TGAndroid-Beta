package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.jl;
public final class m0 implements Runnable {
    public final int f19584a;
    public final int f19585b;
    public final boolean f19586c;
    public final Object d;
    public final Object f19587e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19584a = i11;
        this.d = obj;
        this.f19587e = obj2;
        this.f19585b = i10;
        this.f19586c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19584a = 2;
        this.d = jlVar;
        this.f19586c = z10;
        this.f19587e = arrayList;
        this.f19585b = i10;
    }

    public m0(tw0 tw0Var, boolean z10, int i10, u1 u1Var) {
        this.f19584a = 5;
        this.d = tw0Var;
        this.f19586c = z10;
        this.f19585b = i10;
        this.f19587e = u1Var;
    }

    public m0(u61 u61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19584a = i11;
        this.d = u61Var;
        this.f19585b = i10;
        this.f19587e = tL_messages_searchGlobal;
        this.f19586c = z10;
    }
}
