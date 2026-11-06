package org.telegram.messenger;

import java.util.ArrayList;
public final class dq implements Runnable {
    public final int f22042a;
    public final yr f22043b;
    public final ArrayList f22044c;
    public final boolean d;

    public dq(yr yrVar, ArrayList arrayList, boolean z9, int i7) {
        this.f22042a = i7;
        this.f22043b = yrVar;
        this.f22044c = arrayList;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dq.run():void");
    }

    public dq(yr yrVar, boolean z9, ArrayList arrayList) {
        this.f22042a = 2;
        this.f22043b = yrVar;
        this.d = z9;
        this.f22044c = arrayList;
    }
}
