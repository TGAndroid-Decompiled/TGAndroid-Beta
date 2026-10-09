package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.ol;
public final class n0 implements Runnable {
    public final int f19594a;
    public final int f19595b;
    public final boolean f19596c;
    public final Object d;
    public final Object f19597e;

    public n0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f19594a = i11;
        this.d = obj;
        this.f19597e = obj2;
        this.f19595b = i10;
        this.f19596c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.n0.run():void");
    }

    public n0(ol olVar, boolean z10, ArrayList arrayList, int i10) {
        this.f19594a = 2;
        this.d = olVar;
        this.f19596c = z10;
        this.f19597e = arrayList;
        this.f19595b = i10;
    }

    public n0(ax0 ax0Var, boolean z10, int i10, u1 u1Var) {
        this.f19594a = 5;
        this.d = ax0Var;
        this.f19596c = z10;
        this.f19595b = i10;
        this.f19597e = u1Var;
    }

    public n0(c71 c71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f19594a = i11;
        this.d = c71Var;
        this.f19595b = i10;
        this.f19597e = tL_messages_searchGlobal;
        this.f19596c = z10;
    }
}
