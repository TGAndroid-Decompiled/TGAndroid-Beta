package org.telegram.messenger;

import java.util.ArrayList;
public final class nv implements Runnable {
    public final int f25990a;
    public final pv f25991b;

    public nv(pv pvVar, int i7) {
        this.f25990a = i7;
        this.f25991b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f25990a) {
            case 0:
                this.f25991b.g(false);
                return;
            case 1:
                this.f25991b.f26305o = false;
                return;
            case 2:
                pv pvVar = this.f25991b;
                pvVar.f26305o = false;
                pvVar.f26302l = false;
                return;
            case 3:
                this.f25991b.l();
                return;
            default:
                pv pvVar2 = this.f25991b;
                if (!pvVar2.f26305o) {
                    pvVar2.f26305o = true;
                    ArrayList arrayList = new ArrayList(pvVar2.f26300j);
                    tr a02 = tr.a0(pvVar2.f26293a);
                    a02.f27052a.c(new kg(pvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
