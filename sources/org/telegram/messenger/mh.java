package org.telegram.messenger;

import java.util.ArrayList;
public final class mh implements Runnable {
    public final int f25548a;
    public final pi f25549b;
    public final ArrayList f25550c;
    public final String d;

    public mh(pi piVar, ArrayList arrayList, String str, int i7) {
        this.f25548a = i7;
        this.f25549b = piVar;
        this.f25550c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f25548a) {
            case 0:
                g0.g3(new mh(this.f25549b, this.f25550c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f25550c;
                this.f25549b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f25550c;
                this.f25549b.e(this.d, arrayList2);
                return;
        }
    }
}
