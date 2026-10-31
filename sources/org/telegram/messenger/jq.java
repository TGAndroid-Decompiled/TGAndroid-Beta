package org.telegram.messenger;

import java.util.ArrayList;
public final class jq implements Runnable {
    public final int f16416a;
    public final hs f16417b;
    public final ArrayList f16418c;
    public final boolean d;

    public jq(hs hsVar, ArrayList arrayList, boolean z10, int i10) {
        this.f16416a = i10;
        this.f16417b = hsVar;
        this.f16418c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jq.run():void");
    }

    public jq(hs hsVar, boolean z10, ArrayList arrayList) {
        this.f16416a = 2;
        this.f16417b = hsVar;
        this.d = z10;
        this.f16418c = arrayList;
    }
}
