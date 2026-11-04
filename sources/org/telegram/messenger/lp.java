package org.telegram.messenger;

import java.util.ArrayList;
public final class lp implements Runnable {
    public final int f24094a;
    public final qr f24095b;
    public final int f24096c;
    public final ArrayList d;

    public lp(qr qrVar, int i3, ArrayList arrayList, int i10) {
        this.f24094a = i10;
        this.f24095b = qrVar;
        this.f24096c = i3;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lp.run():void");
    }

    public lp(qr qrVar, ArrayList arrayList, int i3) {
        this.f24094a = 2;
        this.f24095b = qrVar;
        this.d = arrayList;
        this.f24096c = i3;
    }
}
