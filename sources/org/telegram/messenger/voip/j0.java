package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.bl;
public final class j0 implements Runnable {
    public final int f21898a;
    public final int f21899b;
    public final boolean f21900c;
    public final Object d;
    public final Object f21901e;

    public j0(int i9, int i10, Object obj, Object obj2, boolean z10) {
        this.f21898a = i10;
        this.d = obj;
        this.f21901e = obj2;
        this.f21899b = i9;
        this.f21900c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.j0.run():void");
    }

    public j0(bl blVar, boolean z10, ArrayList arrayList, int i9) {
        this.f21898a = 2;
        this.d = blVar;
        this.f21900c = z10;
        this.f21901e = arrayList;
        this.f21899b = i9;
    }

    public j0(fv0 fv0Var, boolean z10, int i9, t1 t1Var) {
        this.f21898a = 5;
        this.d = fv0Var;
        this.f21900c = z10;
        this.f21899b = i9;
        this.f21901e = t1Var;
    }

    public j0(z41 z41Var, int i9, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f21898a = i10;
        this.d = z41Var;
        this.f21899b = i9;
        this.f21901e = tL_messages_searchGlobal;
        this.f21900c = z10;
    }
}
