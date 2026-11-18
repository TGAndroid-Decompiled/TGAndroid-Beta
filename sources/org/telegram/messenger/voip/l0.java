package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.sk;
public final class l0 implements Runnable {
    public final int f27518a;
    public final int f27519b;
    public final boolean f27520c;
    public final Object d;
    public final Object f27521e;

    public l0(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f27518a = i10;
        this.d = obj;
        this.f27521e = obj2;
        this.f27519b = i7;
        this.f27520c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(sk skVar, boolean z10, ArrayList arrayList, int i7) {
        this.f27518a = 2;
        this.d = skVar;
        this.f27520c = z10;
        this.f27521e = arrayList;
        this.f27519b = i7;
    }

    public l0(iu0 iu0Var, boolean z10, int i7, q1 q1Var) {
        this.f27518a = 5;
        this.d = iu0Var;
        this.f27520c = z10;
        this.f27519b = i7;
        this.f27521e = q1Var;
    }

    public l0(z41 z41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27518a = i10;
        this.d = z41Var;
        this.f27519b = i7;
        this.f27521e = tL_messages_searchGlobal;
        this.f27520c = z10;
    }
}
