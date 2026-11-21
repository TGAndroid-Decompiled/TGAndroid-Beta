package org.telegram.messenger;

import java.util.ArrayList;
public final class lh implements Runnable {
    public final int f25406a;
    public final oi f25407b;
    public final ArrayList f25408c;
    public final String d;

    public lh(oi oiVar, ArrayList arrayList, String str, int i7) {
        this.f25406a = i7;
        this.f25407b = oiVar;
        this.f25408c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f25406a) {
            case 0:
                g0.g3(new lh(this.f25407b, this.f25408c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f25408c;
                this.f25407b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f25408c;
                this.f25407b.e(this.d, arrayList2);
                return;
        }
    }
}
