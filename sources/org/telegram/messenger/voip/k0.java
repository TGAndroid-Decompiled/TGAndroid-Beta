package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.tk;
public final class k0 implements Runnable {
    public final int f26137a;
    public final int f26138b;
    public final boolean f26139c;
    public final Object d;
    public final Object f26140e;

    public k0(int i7, int i10, Object obj, Object obj2, boolean z9) {
        this.f26137a = i10;
        this.d = obj;
        this.f26140e = obj2;
        this.f26138b = i7;
        this.f26139c = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.k0.run():void");
    }

    public k0(tk tkVar, boolean z9, ArrayList arrayList, int i7) {
        this.f26137a = 2;
        this.d = tkVar;
        this.f26139c = z9;
        this.f26140e = arrayList;
        this.f26138b = i7;
    }

    public k0(bu0 bu0Var, boolean z9, int i7, q1 q1Var) {
        this.f26137a = 5;
        this.d = bu0Var;
        this.f26139c = z9;
        this.f26138b = i7;
        this.f26140e = q1Var;
    }

    public k0(m41 m41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, int i10) {
        this.f26137a = i10;
        this.d = m41Var;
        this.f26138b = i7;
        this.f26140e = tL_messages_searchGlobal;
        this.f26139c = z9;
    }
}
