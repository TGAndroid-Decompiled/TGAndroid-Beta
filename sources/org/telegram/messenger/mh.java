package org.telegram.messenger;

import java.util.ArrayList;
public final class mh implements Runnable {
    public final int f25584a;
    public final pi f25585b;
    public final ArrayList f25586c;
    public final String d;

    public mh(pi piVar, ArrayList arrayList, String str, int i7) {
        this.f25584a = i7;
        this.f25585b = piVar;
        this.f25586c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f25584a) {
            case 0:
                g0.g3(new mh(this.f25585b, this.f25586c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f25586c;
                this.f25585b.e(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f25586c;
                this.f25585b.e(this.d, arrayList2);
                return;
        }
    }
}
