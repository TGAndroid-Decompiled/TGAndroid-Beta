package org.telegram.messenger;

import java.util.ArrayList;
public final class nv implements Runnable {
    public final int f26018a;
    public final pv f26019b;

    public nv(pv pvVar, int i7) {
        this.f26018a = i7;
        this.f26019b = pvVar;
    }

    @Override
    public final void run() {
        switch (this.f26018a) {
            case 0:
                this.f26019b.g(false);
                return;
            case 1:
                this.f26019b.f26333o = false;
                return;
            case 2:
                pv pvVar = this.f26019b;
                pvVar.f26333o = false;
                pvVar.f26330l = false;
                return;
            case 3:
                this.f26019b.l();
                return;
            default:
                pv pvVar2 = this.f26019b;
                if (!pvVar2.f26333o) {
                    pvVar2.f26333o = true;
                    ArrayList arrayList = new ArrayList(pvVar2.f26328j);
                    tr a02 = tr.a0(pvVar2.f26321a);
                    a02.f27080a.c(new kg(pvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
