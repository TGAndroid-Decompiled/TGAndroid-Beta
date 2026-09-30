package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.jl;
public final class m0 implements Runnable {
    public final int f17931a;
    public final int f17932b;
    public final boolean f17933c;
    public final Object d;
    public final Object e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f17931a = i11;
        this.d = obj;
        this.e = obj2;
        this.f17932b = i10;
        this.f17933c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f17931a = 2;
        this.d = jlVar;
        this.f17933c = z10;
        this.e = arrayList;
        this.f17932b = i10;
    }

    public m0(kw0 kw0Var, boolean z10, int i10, u1 u1Var) {
        this.f17931a = 5;
        this.d = kw0Var;
        this.f17933c = z10;
        this.f17932b = i10;
        this.e = u1Var;
    }

    public m0(l61 l61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17931a = i11;
        this.d = l61Var;
        this.f17932b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17933c = z10;
    }
}
