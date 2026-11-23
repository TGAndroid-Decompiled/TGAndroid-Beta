package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.sk;
public final class l0 implements Runnable {
    public final int f27612a;
    public final int f27613b;
    public final boolean f27614c;
    public final Object d;
    public final Object f27615e;

    public l0(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f27612a = i10;
        this.d = obj;
        this.f27615e = obj2;
        this.f27613b = i7;
        this.f27614c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(sk skVar, boolean z10, ArrayList arrayList, int i7) {
        this.f27612a = 2;
        this.d = skVar;
        this.f27614c = z10;
        this.f27615e = arrayList;
        this.f27613b = i7;
    }

    public l0(ku0 ku0Var, boolean z10, int i7, r1 r1Var) {
        this.f27612a = 5;
        this.d = ku0Var;
        this.f27614c = z10;
        this.f27613b = i7;
        this.f27615e = r1Var;
    }

    public l0(b51 b51Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27612a = i10;
        this.d = b51Var;
        this.f27613b = i7;
        this.f27615e = tL_messages_searchGlobal;
        this.f27614c = z10;
    }
}
