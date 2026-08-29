package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.el;
public final class k0 implements Runnable {
    public final int f21969a;
    public final int f21970b;
    public final boolean f21971c;
    public final Object d;
    public final Object f21972e;

    public k0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f21969a = i11;
        this.d = obj;
        this.f21972e = obj2;
        this.f21970b = i10;
        this.f21971c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.k0.run():void");
    }

    public k0(el elVar, boolean z10, ArrayList arrayList, int i10) {
        this.f21969a = 2;
        this.d = elVar;
        this.f21971c = z10;
        this.f21972e = arrayList;
        this.f21970b = i10;
    }

    public k0(pv0 pv0Var, boolean z10, int i10, s1 s1Var) {
        this.f21969a = 5;
        this.d = pv0Var;
        this.f21971c = z10;
        this.f21970b = i10;
        this.f21972e = s1Var;
    }

    public k0(k51 k51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f21969a = i11;
        this.d = k51Var;
        this.f21970b = i10;
        this.f21972e = tL_messages_searchGlobal;
        this.f21971c = z10;
    }
}
