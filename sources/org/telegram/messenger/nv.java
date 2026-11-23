package org.telegram.messenger;

import java.util.ArrayList;
public final class nv implements Runnable {
    public final int f26086a;
    public final pv f26087b;

    public nv(pv pvVar, int i7) {
        this.f26086a = i7;
        this.f26087b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f26086a) {
            case 0:
                this.f26087b.g(false);
                return;
            case 1:
                this.f26087b.f26399o = false;
                return;
            case 2:
                pv pvVar = this.f26087b;
                pvVar.f26399o = false;
                pvVar.f26396l = false;
                return;
            case 3:
                this.f26087b.l();
                return;
            default:
                pv pvVar2 = this.f26087b;
                if (!pvVar2.f26399o) {
                    pvVar2.f26399o = true;
                    ArrayList arrayList = new ArrayList(pvVar2.f26394j);
                    tr a02 = tr.a0(pvVar2.f26387a);
                    a02.f27149a.c(new kg(pvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
