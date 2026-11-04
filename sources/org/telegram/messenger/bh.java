package org.telegram.messenger;

import java.util.ArrayList;
public final class bh implements Runnable {
    public final int f21830a;
    public final ii f21831b;
    public final ArrayList f21832c;
    public final String d;

    public bh(ii iiVar, ArrayList arrayList, String str, int i3) {
        this.f21830a = i3;
        this.f21831b = iiVar;
        this.f21832c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f21830a) {
            case 0:
                g0.h3(new bh(this.f21831b, this.f21832c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f21832c;
                this.f21831b.h(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f21832c;
                this.f21831b.h(this.d, arrayList2);
                return;
        }
    }
}
