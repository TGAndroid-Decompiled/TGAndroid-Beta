package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.fl;
public final class k0 implements Runnable {
    public final int f19874a;
    public final int f19875b;
    public final boolean f19876c;
    public final Object d;
    public final Object e;

    public k0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19874a = i11;
        this.d = obj;
        this.e = obj2;
        this.f19875b = i10;
        this.f19876c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.k0.run():void");
    }

    public k0(fl flVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19874a = 2;
        this.d = flVar;
        this.f19876c = z10;
        this.e = arrayList;
        this.f19875b = i10;
    }

    public k0(tw0 tw0Var, boolean z10, int i10, u1 u1Var) {
        this.f19874a = 5;
        this.d = tw0Var;
        this.f19876c = z10;
        this.f19875b = i10;
        this.e = u1Var;
    }

    public k0(u61 u61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19874a = i11;
        this.d = u61Var;
        this.f19875b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19876c = z10;
    }
}
