package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.nk;
public final class j0 implements Runnable {
    public final int f26016a;
    public final int f26017b;
    public final boolean f26018c;
    public final Object d;
    public final Object f26019e;

    public j0(int i3, int i10, Object obj, Object obj2, boolean z10) {
        this.f26016a = i10;
        this.d = obj;
        this.f26019e = obj2;
        this.f26017b = i3;
        this.f26018c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.j0.run():void");
    }

    public j0(nk nkVar, boolean z10, ArrayList arrayList, int i3) {
        this.f26016a = 2;
        this.d = nkVar;
        this.f26018c = z10;
        this.f26019e = arrayList;
        this.f26017b = i3;
    }

    public j0(yt0 yt0Var, boolean z10, int i3, q1 q1Var) {
        this.f26016a = 5;
        this.d = yt0Var;
        this.f26018c = z10;
        this.f26017b = i3;
        this.f26019e = q1Var;
    }

    public j0(f41 f41Var, int i3, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f26016a = i10;
        this.d = f41Var;
        this.f26017b = i3;
        this.f26019e = tL_messages_searchGlobal;
        this.f26018c = z10;
    }
}
