package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.kl;
public final class l0 implements Runnable {
    public final int f20434a;
    public final int f20435b;
    public final boolean f20436c;
    public final Object d;
    public final Object f20437e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.f20434a = i11;
        this.d = obj;
        this.f20437e = obj2;
        this.f20435b = i10;
        this.f20436c = z4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(kl klVar, boolean z4, ArrayList arrayList, int i10) {
        this.f20434a = 2;
        this.d = klVar;
        this.f20436c = z4;
        this.f20437e = arrayList;
        this.f20435b = i10;
    }

    public l0(yv0 yv0Var, boolean z4, int i10, t1 t1Var) {
        this.f20434a = 5;
        this.d = yv0Var;
        this.f20436c = z4;
        this.f20435b = i10;
        this.f20437e = t1Var;
    }

    public l0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.f20434a = i11;
        this.d = w51Var;
        this.f20435b = i10;
        this.f20437e = tL_messages_searchGlobal;
        this.f20436c = z4;
    }
}
