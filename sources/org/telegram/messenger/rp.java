package org.telegram.messenger;

import java.util.ArrayList;
public final class rp implements Runnable {
    public final int f26322a;
    public final vr f26323b;
    public final int f26324c;
    public final ArrayList d;

    public rp(vr vrVar, int i7, ArrayList arrayList, int i10) {
        this.f26322a = i10;
        this.f26323b = vrVar;
        this.f26324c = i7;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rp.run():void");
    }

    public rp(vr vrVar, ArrayList arrayList, int i7) {
        this.f26322a = 2;
        this.f26323b = vrVar;
        this.d = arrayList;
        this.f26324c = i7;
    }
}
