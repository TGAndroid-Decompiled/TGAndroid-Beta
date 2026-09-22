package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.ll;
public final class l0 implements Runnable {
    public final int f17912a;
    public final int f17913b;
    public final boolean f17914c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f17912a = i11;
        this.d = obj;
        this.e = obj2;
        this.f17913b = i10;
        this.f17914c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(ll llVar, boolean z10, ArrayList arrayList, int i10) {
        this.f17912a = 2;
        this.d = llVar;
        this.f17914c = z10;
        this.e = arrayList;
        this.f17913b = i10;
    }

    public l0(kw0 kw0Var, boolean z10, int i10, u1 u1Var) {
        this.f17912a = 5;
        this.d = kw0Var;
        this.f17914c = z10;
        this.f17913b = i10;
        this.e = u1Var;
    }

    public l0(m61 m61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17912a = i11;
        this.d = m61Var;
        this.f17913b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17914c = z10;
    }
}
