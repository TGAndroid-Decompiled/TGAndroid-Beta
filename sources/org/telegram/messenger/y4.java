package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class y4 implements Runnable {
    public final int f27655a = 1;
    public final int f27656b;
    public final ArrayList f27657c;
    public final boolean d;
    public final c1 f27658e;
    public final Object f27659f;
    public final Object h;

    public y4(g5 g5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f27658e = g5Var;
        this.f27656b = i7;
        this.f27657c = arrayList;
        this.f27659f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y4.run():void");
    }

    public y4(ez ezVar, TLObject tLObject, int i7, qy qyVar, ArrayList arrayList, boolean z10) {
        this.f27658e = ezVar;
        this.f27659f = tLObject;
        this.f27656b = i7;
        this.h = qyVar;
        this.f27657c = arrayList;
        this.d = z10;
    }
}
