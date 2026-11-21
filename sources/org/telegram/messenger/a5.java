package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class a5 implements Runnable {
    public final int f22847a = 0;
    public final int f22848b;
    public final ArrayList f22849c;
    public final boolean d;
    public final c1 f22850e;
    public final Object f22851f;
    public final Object h;

    public a5(i5 i5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f22850e = i5Var;
        this.f22848b = i7;
        this.f22849c = arrayList;
        this.f22851f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a5.run():void");
    }

    public a5(zy zyVar, TLObject tLObject, int i7, ly lyVar, ArrayList arrayList, boolean z10) {
        this.f22850e = zyVar;
        this.f22851f = tLObject;
        this.f22848b = i7;
        this.h = lyVar;
        this.f22849c = arrayList;
        this.d = z10;
    }
}
