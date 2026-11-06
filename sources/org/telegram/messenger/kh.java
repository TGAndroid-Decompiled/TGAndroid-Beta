package org.telegram.messenger;

import java.util.ArrayList;
public final class kh implements Runnable {
    public final int f23678a;
    public final ri f23679b;
    public final ArrayList f23680c;
    public final String d;

    public kh(ri riVar, ArrayList arrayList, String str, int i7) {
        this.f23678a = i7;
        this.f23679b = riVar;
        this.f23680c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f23678a) {
            case 0:
                g0.h3(new kh(this.f23679b, this.f23680c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f23680c;
                this.f23679b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f23680c;
                this.f23679b.e(this.d, arrayList2);
                return;
        }
    }
}
