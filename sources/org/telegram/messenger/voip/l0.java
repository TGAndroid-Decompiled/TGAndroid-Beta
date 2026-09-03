package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.ml;
public final class l0 implements Runnable {
    public final int f18784a;
    public final int f18785b;
    public final boolean f18786c;
    public final Object d;
    public final Object e;

    public l0(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.f18784a = i11;
        this.d = obj;
        this.e = obj2;
        this.f18785b = i10;
        this.f18786c = z4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.l0.run():void");
    }

    public l0(ml mlVar, boolean z4, ArrayList arrayList, int i10) {
        this.f18784a = 2;
        this.d = mlVar;
        this.f18786c = z4;
        this.e = arrayList;
        this.f18785b = i10;
    }

    public l0(yv0 yv0Var, boolean z4, int i10, s1 s1Var) {
        this.f18784a = 5;
        this.d = yv0Var;
        this.f18786c = z4;
        this.f18785b = i10;
        this.e = s1Var;
    }

    public l0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.f18784a = i11;
        this.d = w51Var;
        this.f18785b = i10;
        this.e = tL_messages_searchGlobal;
        this.f18786c = z4;
    }
}
