package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.kl;
public final class l0 implements Runnable {
    public final int f17657a;
    public final int f17658b;
    public final boolean f17659c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f17657a = i11;
        this.d = obj;
        this.e = obj2;
        this.f17658b = i10;
        this.f17659c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(kl klVar, boolean z10, ArrayList arrayList, int i10) {
        this.f17657a = 2;
        this.d = klVar;
        this.f17659c = z10;
        this.e = arrayList;
        this.f17658b = i10;
    }

    public l0(xv0 xv0Var, boolean z10, int i10, t1 t1Var) {
        this.f17657a = 5;
        this.d = xv0Var;
        this.f17659c = z10;
        this.f17658b = i10;
        this.e = t1Var;
    }

    public l0(v51 v51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17657a = i11;
        this.d = v51Var;
        this.f17658b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17659c = z10;
    }
}
