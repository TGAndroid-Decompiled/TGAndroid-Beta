package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.sl;
public final class n0 implements Runnable {
    public final int f18834a;
    public final int f18835b;
    public final boolean f18836c;
    public final Object d;
    public final Object e;

    public n0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f18834a = i11;
        this.d = obj;
        this.e = obj2;
        this.f18835b = i10;
        this.f18836c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.n0.run():void");
    }

    public n0(sl slVar, boolean z10, ArrayList arrayList, int i10) {
        this.f18834a = 2;
        this.d = slVar;
        this.f18836c = z10;
        this.e = arrayList;
        this.f18835b = i10;
    }

    public n0(ww0 ww0Var, boolean z10, int i10, u1 u1Var) {
        this.f18834a = 5;
        this.d = ww0Var;
        this.f18836c = z10;
        this.f18835b = i10;
        this.e = u1Var;
    }

    public n0(z61 z61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18834a = i11;
        this.d = z61Var;
        this.f18835b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18836c = z10;
    }
}
