package org.telegram.messenger;

import java.util.ArrayList;
public final class jh implements Runnable {
    public final int f16466a;
    public final si f16467b;
    public final ArrayList f16468c;
    public final String d;

    public jh(si siVar, ArrayList arrayList, String str, int i10) {
        this.f16466a = i10;
        this.f16467b = siVar;
        this.f16468c = arrayList;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f16466a) {
            case 0:
                i0.g3(new jh(this.f16467b, this.f16468c, this.d, 2));
                return;
            case 1:
                ArrayList arrayList = this.f16468c;
                this.f16467b.c(this.d, arrayList);
                return;
            default:
                ArrayList arrayList2 = this.f16468c;
                this.f16467b.c(this.d, arrayList2);
                return;
        }
    }
}
