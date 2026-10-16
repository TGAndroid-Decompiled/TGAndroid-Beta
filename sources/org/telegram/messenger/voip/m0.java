package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.sl;
public final class m0 implements Runnable {
    public final int f18525a;
    public final int f18526b;
    public final boolean f18527c;
    public final Object d;
    public final Object e;

    public m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f18525a = i11;
        this.d = obj;
        this.e = obj2;
        this.f18526b = i10;
        this.f18527c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.m0.run():void");
    }

    public m0(sl slVar, boolean z10, ArrayList arrayList, int i10) {
        this.f18525a = 2;
        this.d = slVar;
        this.f18527c = z10;
        this.e = arrayList;
        this.f18526b = i10;
    }

    public m0(ww0 ww0Var, boolean z10, int i10, u1 u1Var) {
        this.f18525a = 5;
        this.d = ww0Var;
        this.f18527c = z10;
        this.f18526b = i10;
        this.e = u1Var;
    }

    public m0(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f18525a = i11;
        this.d = a71Var;
        this.f18526b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18527c = z10;
    }
}
