package org.telegram.messenger;

import java.util.ArrayList;
public final class dq implements Runnable {
    public final int f22071a;
    public final yr f22072b;
    public final ArrayList f22073c;
    public final boolean d;

    public dq(yr yrVar, ArrayList arrayList, boolean z9, int i7) {
        this.f22071a = i7;
        this.f22072b = yrVar;
        this.f22073c = arrayList;
        this.d = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dq.run():void");
    }

    public dq(yr yrVar, boolean z9, ArrayList arrayList) {
        this.f22071a = 2;
        this.f22072b = yrVar;
        this.d = z9;
        this.f22073c = arrayList;
    }
}
