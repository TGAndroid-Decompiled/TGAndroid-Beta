package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.kl;
public final class l0 implements Runnable {
    public final int f17859a;
    public final int f17860b;
    public final boolean f17861c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f17859a = i11;
        this.d = obj;
        this.e = obj2;
        this.f17860b = i10;
        this.f17861c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(kl klVar, boolean z10, ArrayList arrayList, int i10) {
        this.f17859a = 2;
        this.d = klVar;
        this.f17861c = z10;
        this.e = arrayList;
        this.f17860b = i10;
    }

    public l0(jw0 jw0Var, boolean z10, int i10, u1 u1Var) {
        this.f17859a = 5;
        this.d = jw0Var;
        this.f17861c = z10;
        this.f17860b = i10;
        this.e = u1Var;
    }

    public l0(l61 l61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f17859a = i11;
        this.d = l61Var;
        this.f17860b = i10;
        this.e = tL_messages_searchGlobal;
        this.f17861c = z10;
    }
}
