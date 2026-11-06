package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.rk;
public final class k0 implements Runnable {
    public final int f26131a;
    public final int f26132b;
    public final boolean f26133c;
    public final Object d;
    public final Object f26134e;

    public k0(int i7, int i10, Object obj, Object obj2, boolean z9) {
        this.f26131a = i10;
        this.d = obj;
        this.f26134e = obj2;
        this.f26132b = i7;
        this.f26133c = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.k0.run():void");
    }

    public k0(rk rkVar, boolean z9, ArrayList arrayList, int i7) {
        this.f26131a = 2;
        this.d = rkVar;
        this.f26133c = z9;
        this.f26134e = arrayList;
        this.f26132b = i7;
    }

    public k0(zt0 zt0Var, boolean z9, int i7, q1 q1Var) {
        this.f26131a = 5;
        this.d = zt0Var;
        this.f26133c = z9;
        this.f26132b = i7;
        this.f26134e = q1Var;
    }

    public k0(l41 l41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, int i10) {
        this.f26131a = i10;
        this.d = l41Var;
        this.f26132b = i7;
        this.f26134e = tL_messages_searchGlobal;
        this.f26133c = z9;
    }
}
