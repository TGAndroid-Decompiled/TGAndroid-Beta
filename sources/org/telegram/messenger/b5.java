package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class b5 implements Runnable {
    public final int f14723a = 0;
    public final int f14724b;
    public final ArrayList f14725c;
    public final boolean d;
    public final f1 e;
    public final Object f14726f;
    public final Object h;

    public b5(i5 i5Var, int i10, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.e = i5Var;
        this.f14724b = i10;
        this.f14725c = arrayList;
        this.f14726f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b5.run():void");
    }

    public b5(qz qzVar, TLObject tLObject, int i10, cz czVar, ArrayList arrayList, boolean z10) {
        this.e = qzVar;
        this.f14726f = tLObject;
        this.f14724b = i10;
        this.h = czVar;
        this.f14725c = arrayList;
        this.d = z10;
    }
}
