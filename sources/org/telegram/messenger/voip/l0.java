package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.nl;
public final class l0 implements Runnable {
    public final int f17682a;
    public final int f17683b;
    public final boolean f17684c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f17682a = i11;
        this.d = obj;
        this.e = obj2;
        this.f17683b = i10;
        this.f17684c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(nl nlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f17682a = 2;
        this.d = nlVar;
        this.f17684c = z10;
        this.e = arrayList;
        this.f17683b = i10;
    }

    public l0(yv0 yv0Var, boolean z10, int i10, t1 t1Var) {
        this.f17682a = 5;
        this.d = yv0Var;
        this.f17684c = z10;
        this.f17683b = i10;
        this.e = t1Var;
    }

    public l0(x51 x51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17682a = i11;
        this.d = x51Var;
        this.f17683b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17684c = z10;
    }
}
