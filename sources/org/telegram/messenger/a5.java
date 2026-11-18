package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class a5 implements Runnable {
    public final int f22822a = 0;
    public final int f22823b;
    public final ArrayList f22824c;
    public final boolean d;
    public final c1 f22825e;
    public final Object f22826f;
    public final Object h;

    public a5(i5 i5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f22825e = i5Var;
        this.f22823b = i7;
        this.f22824c = arrayList;
        this.f22826f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a5.run():void");
    }

    public a5(zy zyVar, TLObject tLObject, int i7, ly lyVar, ArrayList arrayList, boolean z10) {
        this.f22825e = zyVar;
        this.f22826f = tLObject;
        this.f22823b = i7;
        this.h = lyVar;
        this.f22824c = arrayList;
        this.d = z10;
    }
}
