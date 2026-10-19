package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.fl;
public final class k0 implements Runnable {
    public final int f19880a;
    public final int f19881b;
    public final boolean f19882c;
    public final Object d;
    public final Object e;

    public k0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19880a = i11;
        this.d = obj;
        this.e = obj2;
        this.f19881b = i10;
        this.f19882c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.k0.run():void");
    }

    public k0(fl flVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19880a = 2;
        this.d = flVar;
        this.f19882c = z10;
        this.e = arrayList;
        this.f19881b = i10;
    }

    public k0(sw0 sw0Var, boolean z10, int i10, u1 u1Var) {
        this.f19880a = 5;
        this.d = sw0Var;
        this.f19882c = z10;
        this.f19881b = i10;
        this.e = u1Var;
    }

    public k0(t61 t61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19880a = i11;
        this.d = t61Var;
        this.f19881b = i10;
        this.e = tL_messages_searchGlobal;
        this.f19882c = z10;
    }
}
