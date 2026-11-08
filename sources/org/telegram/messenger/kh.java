package org.telegram.messenger;

import java.util.ArrayList;
public final class kh implements Runnable {
    public final int f23689a;
    public final ri f23690b;
    public final ArrayList f23691c;
    public final String d;

    public kh(ri riVar, ArrayList arrayList, String str, int i7) {
        this.f23689a = i7;
        this.f23690b = riVar;
        this.f23691c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f23689a) {
            case 0:
                g0.h3(new kh(this.f23690b, this.f23691c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f23691c;
                this.f23690b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f23691c;
                this.f23690b.e(this.d, arrayList2);
                return;
        }
    }
}
