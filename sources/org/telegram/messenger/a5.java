package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class a5 implements Runnable {
    public final int f22862a = 1;
    public final int f22863b;
    public final ArrayList f22864c;
    public final boolean d;
    public final c1 f22865e;
    public final Object f22866f;
    public final Object h;

    public a5(i5 i5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z10) {
        this.f22865e = i5Var;
        this.f22863b = i7;
        this.f22864c = arrayList;
        this.f22866f = arrayList2;
        this.h = hVar;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.a5.run():void");
    }

    public a5(az azVar, TLObject tLObject, int i7, my myVar, ArrayList arrayList, boolean z10) {
        this.f22865e = azVar;
        this.f22866f = tLObject;
        this.f22863b = i7;
        this.h = myVar;
        this.f22864c = arrayList;
        this.d = z10;
    }
}
