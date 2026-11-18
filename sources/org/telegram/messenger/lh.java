package org.telegram.messenger;

import java.util.ArrayList;
public final class lh implements Runnable {
    public final int f25380a;
    public final oi f25381b;
    public final ArrayList f25382c;
    public final String d;

    public lh(oi oiVar, ArrayList arrayList, String str, int i7) {
        this.f25380a = i7;
        this.f25381b = oiVar;
        this.f25382c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f25380a) {
            case 0:
                g0.g3(new lh(this.f25381b, this.f25382c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f25382c;
                this.f25381b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f25382c;
                this.f25381b.e(this.d, arrayList2);
                return;
        }
    }
}
