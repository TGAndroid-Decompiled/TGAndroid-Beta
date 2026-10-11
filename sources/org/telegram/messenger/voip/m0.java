package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.ol;
public final class m0 implements Runnable {
    public final int f19587a;
    public final int f19588b;
    public final boolean f19589c;
    public final Object d;
    public final Object f19590e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19587a = i11;
        this.d = obj;
        this.f19590e = obj2;
        this.f19588b = i10;
        this.f19589c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(ol olVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19587a = 2;
        this.d = olVar;
        this.f19589c = z10;
        this.f19590e = arrayList;
        this.f19588b = i10;
    }

    public m0(cx0 cx0Var, boolean z10, int i10, u1 u1Var) {
        this.f19587a = 5;
        this.d = cx0Var;
        this.f19589c = z10;
        this.f19588b = i10;
        this.f19590e = u1Var;
    }

    public m0(e71 e71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19587a = i11;
        this.d = e71Var;
        this.f19588b = i10;
        this.f19590e = tL_messages_searchGlobal;
        this.f19589c = z10;
    }
}
