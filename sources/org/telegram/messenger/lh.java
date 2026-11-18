package org.telegram.messenger;

import java.util.ArrayList;
public final class lh implements Runnable {
    public final int f25378a;
    public final oi f25379b;
    public final ArrayList f25380c;
    public final String d;

    public lh(oi oiVar, ArrayList arrayList, String str, int i7) {
        this.f25378a = i7;
        this.f25379b = oiVar;
        this.f25380c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f25378a) {
            case 0:
                g0.g3(new lh(this.f25379b, this.f25380c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f25380c;
                this.f25379b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f25380c;
                this.f25379b.e(this.d, arrayList2);
                return;
        }
    }
}
