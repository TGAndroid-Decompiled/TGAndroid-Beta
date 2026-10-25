package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.hl;
public final class j0 implements Runnable {
    public final int f21652a;
    public final int f21653b;
    public final boolean f21654c;
    public final Object d;
    public final Object e;

    public j0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f21652a = i11;
        this.d = obj;
        this.e = obj2;
        this.f21653b = i10;
        this.f21654c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.j0.run():void");
    }

    public j0(hl hlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f21652a = 2;
        this.d = hlVar;
        this.f21654c = z10;
        this.e = arrayList;
        this.f21653b = i10;
    }

    public j0(dx0 dx0Var, boolean z10, int i10, s1 s1Var) {
        this.f21652a = 5;
        this.d = dx0Var;
        this.f21654c = z10;
        this.f21653b = i10;
        this.e = s1Var;
    }

    public j0(j71 j71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f21652a = i11;
        this.d = j71Var;
        this.f21653b = i10;
        this.e = tL_messages_searchGlobal;
        this.f21654c = z10;
    }
}
