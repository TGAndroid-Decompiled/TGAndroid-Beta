package org.telegram.messenger;

import java.util.ArrayList;
public final class up implements Runnable {
    public final int f25733a;
    public final qr f25734b;
    public final ArrayList f25735c;
    public final boolean d;

    public up(qr qrVar, ArrayList arrayList, boolean z10, int i3) {
        this.f25733a = i3;
        this.f25734b = qrVar;
        this.f25735c = arrayList;
        this.d = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.up.run():void");
    }

    public up(qr qrVar, boolean z10, ArrayList arrayList) {
        this.f25733a = 2;
        this.f25734b = qrVar;
        this.d = z10;
        this.f25735c = arrayList;
    }
}
