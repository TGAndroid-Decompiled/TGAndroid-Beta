package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.d71;
import org.telegram.ui.ol;
public final class n0 implements Runnable {
    public final int f19598a;
    public final int f19599b;
    public final boolean f19600c;
    public final Object d;
    public final Object f19601e;

    public n0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19598a = i11;
        this.d = obj;
        this.f19601e = obj2;
        this.f19599b = i10;
        this.f19600c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.n0.run():void");
    }

    public n0(ol olVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19598a = 2;
        this.d = olVar;
        this.f19600c = z10;
        this.f19601e = arrayList;
        this.f19599b = i10;
    }

    public n0(bx0 bx0Var, boolean z10, int i10, u1 u1Var) {
        this.f19598a = 5;
        this.d = bx0Var;
        this.f19600c = z10;
        this.f19599b = i10;
        this.f19601e = u1Var;
    }

    public n0(d71 d71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19598a = i11;
        this.d = d71Var;
        this.f19599b = i10;
        this.f19601e = tL_messages_searchGlobal;
        this.f19600c = z10;
    }
}
