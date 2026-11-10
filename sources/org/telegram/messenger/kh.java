package org.telegram.messenger;

import java.util.ArrayList;
public final class kh implements Runnable {
    public final int f23693a;
    public final ri f23694b;
    public final ArrayList f23695c;
    public final String d;

    public kh(ri riVar, ArrayList arrayList, String str, int i7) {
        this.f23693a = i7;
        this.f23694b = riVar;
        this.f23695c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f23693a) {
            case 0:
                g0.h3(new kh(this.f23694b, this.f23695c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f23695c;
                this.f23694b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f23695c;
                this.f23694b.e(this.d, arrayList2);
                return;
        }
    }
}
