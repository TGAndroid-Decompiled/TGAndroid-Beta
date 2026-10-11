package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.ol;
public final class m0 implements Runnable {
    public final int f19623a;
    public final int f19624b;
    public final boolean f19625c;
    public final Object d;
    public final Object f19626e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19623a = i11;
        this.d = obj;
        this.f19626e = obj2;
        this.f19624b = i10;
        this.f19625c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(ol olVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19623a = 2;
        this.d = olVar;
        this.f19625c = z10;
        this.f19626e = arrayList;
        this.f19624b = i10;
    }

    public m0(bx0 bx0Var, boolean z10, int i10, u1 u1Var) {
        this.f19623a = 5;
        this.d = bx0Var;
        this.f19625c = z10;
        this.f19624b = i10;
        this.f19626e = u1Var;
    }

    public m0(d71 d71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19623a = i11;
        this.d = d71Var;
        this.f19624b = i10;
        this.f19626e = tL_messages_searchGlobal;
        this.f19625c = z10;
    }
}
