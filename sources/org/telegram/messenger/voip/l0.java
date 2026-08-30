package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.kl;
public final class l0 implements Runnable {
    public final int f18802a;
    public final int f18803b;
    public final boolean f18804c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.f18802a = i11;
        this.d = obj;
        this.e = obj2;
        this.f18803b = i10;
        this.f18804c = z4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(kl klVar, boolean z4, ArrayList arrayList, int i10) {
        this.f18802a = 2;
        this.d = klVar;
        this.f18804c = z4;
        this.e = arrayList;
        this.f18803b = i10;
    }

    public l0(yv0 yv0Var, boolean z4, int i10, t1 t1Var) {
        this.f18802a = 5;
        this.d = yv0Var;
        this.f18804c = z4;
        this.f18803b = i10;
        this.e = t1Var;
    }

    public l0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.f18802a = i11;
        this.d = w51Var;
        this.f18803b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18804c = z4;
    }
}
