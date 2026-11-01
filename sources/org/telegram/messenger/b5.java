package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class b5 implements Runnable {
    public final int f14923a = 0;
    public final int f14924b;
    public final ArrayList f14925c;
    public final boolean d;
    public final f1 e;
    public final Object f14926f;
    public final Object h;

    public b5(i5 i5Var, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.e = i5Var;
        this.f14924b = i10;
        this.f14925c = arrayList;
        this.f14926f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b5.run():void");
    }

    public b5(rz rzVar, TLObject tLObject, int i10, dz dzVar, ArrayList arrayList, boolean z10) {
        this.e = rzVar;
        this.f14926f = tLObject;
        this.f14924b = i10;
        this.h = dzVar;
        this.f14925c = arrayList;
        this.d = z10;
    }
}
