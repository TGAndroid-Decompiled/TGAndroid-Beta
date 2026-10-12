package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.sl;
public final class m0 implements Runnable {
    public final int f19364a;
    public final int f19365b;
    public final boolean f19366c;
    public final Object d;
    public final Object f19367e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19364a = i11;
        this.d = obj;
        this.f19367e = obj2;
        this.f19365b = i10;
        this.f19366c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(sl slVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19364a = 2;
        this.d = slVar;
        this.f19366c = z10;
        this.f19367e = arrayList;
        this.f19365b = i10;
    }

    public m0(gx0 gx0Var, boolean z10, int i10, u1 u1Var) {
        this.f19364a = 5;
        this.d = gx0Var;
        this.f19366c = z10;
        this.f19365b = i10;
        this.f19367e = u1Var;
    }

    public m0(h71 h71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19364a = i11;
        this.d = h71Var;
        this.f19365b = i10;
        this.f19367e = tL_messages_searchGlobal;
        this.f19366c = z10;
    }
}
