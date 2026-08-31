package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.kl;
public final class l0 implements Runnable {
    public final int f20432a;
    public final int f20433b;
    public final boolean f20434c;
    public final Object d;
    public final Object f20435e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.f20432a = i11;
        this.d = obj;
        this.f20435e = obj2;
        this.f20433b = i10;
        this.f20434c = z4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(kl klVar, boolean z4, ArrayList arrayList, int i10) {
        this.f20432a = 2;
        this.d = klVar;
        this.f20434c = z4;
        this.f20435e = arrayList;
        this.f20433b = i10;
    }

    public l0(zv0 zv0Var, boolean z4, int i10, t1 t1Var) {
        this.f20432a = 5;
        this.d = zv0Var;
        this.f20434c = z4;
        this.f20433b = i10;
        this.f20435e = t1Var;
    }

    public l0(x51 x51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.f20432a = i11;
        this.d = x51Var;
        this.f20433b = i10;
        this.f20435e = tL_messages_searchGlobal;
        this.f20434c = z4;
    }
}
