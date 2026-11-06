package org.telegram.messenger;

import java.util.ArrayList;
public final class kh implements Runnable {
    public final int f23685a;
    public final ri f23686b;
    public final ArrayList f23687c;
    public final String d;

    public kh(ri riVar, ArrayList arrayList, String str, int i7) {
        this.f23685a = i7;
        this.f23686b = riVar;
        this.f23687c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f23685a) {
            case 0:
                g0.h3(new kh(this.f23686b, this.f23687c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f23687c;
                this.f23686b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f23687c;
                this.f23686b.e(this.d, arrayList2);
                return;
        }
    }
}
