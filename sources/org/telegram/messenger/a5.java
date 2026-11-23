package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class a5 implements Runnable {
    public final int f22826a = 1;
    public final int f22827b;
    public final ArrayList f22828c;
    public final boolean d;
    public final c1 f22829e;
    public final Object f22830f;
    public final Object h;

    public a5(i5 i5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f22829e = i5Var;
        this.f22827b = i7;
        this.f22828c = arrayList;
        this.f22830f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a5.run():void");
    }

    public a5(az azVar, TLObject tLObject, int i7, my myVar, ArrayList arrayList, boolean z10) {
        this.f22829e = azVar;
        this.f22830f = tLObject;
        this.f22827b = i7;
        this.h = myVar;
        this.f22828c = arrayList;
        this.d = z10;
    }
}
