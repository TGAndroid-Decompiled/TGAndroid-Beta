package org.telegram.messenger;

import java.util.ArrayList;
public final class dq implements Runnable {
    public final int f22067a;
    public final yr f22068b;
    public final ArrayList f22069c;
    public final boolean d;

    public dq(yr yrVar, ArrayList arrayList, boolean z9, int i7) {
        this.f22067a = i7;
        this.f22068b = yrVar;
        this.f22069c = arrayList;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dq.run():void");
    }

    public dq(yr yrVar, boolean z9, ArrayList arrayList) {
        this.f22067a = 2;
        this.f22068b = yrVar;
        this.d = z9;
        this.f22069c = arrayList;
    }
}
