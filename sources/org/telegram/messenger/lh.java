package org.telegram.messenger;

import java.util.ArrayList;
public final class lh implements Runnable {
    public final int f25497a;
    public final oi f25498b;
    public final ArrayList f25499c;
    public final String d;

    public lh(oi oiVar, ArrayList arrayList, String str, int i7) {
        this.f25497a = i7;
        this.f25498b = oiVar;
        this.f25499c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f25497a) {
            case 0:
                g0.g3(new lh(this.f25498b, this.f25499c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f25499c;
                this.f25498b.c(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f25499c;
                this.f25498b.c(this.d, arrayList2);
                return;
        }
    }
}
