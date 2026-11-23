package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.sk;
public final class l0 implements Runnable {
    public final int f27471a;
    public final int f27472b;
    public final boolean f27473c;
    public final Object d;
    public final Object f27474e;

    public l0(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f27471a = i10;
        this.d = obj;
        this.f27474e = obj2;
        this.f27472b = i7;
        this.f27473c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(sk skVar, boolean z10, ArrayList arrayList, int i7) {
        this.f27471a = 2;
        this.d = skVar;
        this.f27473c = z10;
        this.f27474e = arrayList;
        this.f27472b = i7;
    }

    public l0(lu0 lu0Var, boolean z10, int i7, r1 r1Var) {
        this.f27471a = 5;
        this.d = lu0Var;
        this.f27473c = z10;
        this.f27472b = i7;
        this.f27474e = r1Var;
    }

    public l0(c51 c51Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.f27471a = i10;
        this.d = c51Var;
        this.f27472b = i7;
        this.f27474e = tL_messages_searchGlobal;
        this.f27473c = z10;
    }
}
