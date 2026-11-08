package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class y4 implements Runnable {
    public final int f26584a = 0;
    public final int f26585b;
    public final ArrayList f26586c;
    public final boolean d;
    public final c1 f26587e;
    public final Object f26588f;
    public final Object h;

    public y4(g5 g5Var, int i7, ArrayList arrayList, ArrayList arrayList2, a0.h hVar, boolean z9) {
        this.f26587e = g5Var;
        this.f26585b = i7;
        this.f26586c = arrayList;
        this.f26588f = arrayList2;
        this.h = hVar;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y4.run():void");
    }

    public y4(gz gzVar, TLObject tLObject, int i7, sy syVar, ArrayList arrayList, boolean z9) {
        this.f26587e = gzVar;
        this.f26588f = tLObject;
        this.f26585b = i7;
        this.h = syVar;
        this.f26586c = arrayList;
        this.d = z9;
    }
}
