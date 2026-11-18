package org.telegram.messenger;

import java.util.ArrayList;
public final class nv implements Runnable {
    public final int f25992a;
    public final pv f25993b;

    public nv(pv pvVar, int i7) {
        this.f25992a = i7;
        this.f25993b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f25992a) {
            case 0:
                this.f25993b.g(false);
                return;
            case 1:
                this.f25993b.f26307o = false;
                return;
            case 2:
                pv pvVar = this.f25993b;
                pvVar.f26307o = false;
                pvVar.f26304l = false;
                return;
            case 3:
                this.f25993b.l();
                return;
            default:
                pv pvVar2 = this.f25993b;
                if (!pvVar2.f26307o) {
                    pvVar2.f26307o = true;
                    ArrayList arrayList = new ArrayList(pvVar2.f26302j);
                    tr a02 = tr.a0(pvVar2.f26295a);
                    a02.f27054a.c(new kg(pvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
