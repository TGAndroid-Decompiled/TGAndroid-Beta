package org.telegram.messenger;

import java.util.ArrayList;
public final class dq implements Runnable {
    public final int f22049a;
    public final yr f22050b;
    public final ArrayList f22051c;
    public final boolean d;

    public dq(yr yrVar, ArrayList arrayList, boolean z9, int i7) {
        this.f22049a = i7;
        this.f22050b = yrVar;
        this.f22051c = arrayList;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dq.run():void");
    }

    public dq(yr yrVar, boolean z9, ArrayList arrayList) {
        this.f22049a = 2;
        this.f22050b = yrVar;
        this.d = z9;
        this.f22051c = arrayList;
    }
}
