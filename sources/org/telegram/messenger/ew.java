package org.telegram.messenger;

import java.util.ArrayList;
public final class ew implements Runnable {
    public final int f15474a;
    public final gw f15475b;

    public ew(gw gwVar, int i10) {
        this.f15474a = i10;
        this.f15475b = gwVar;
    }

    @Override
    public final void run() {
        switch (this.f15474a) {
            case 0:
                this.f15475b.g(false);
                return;
            case 1:
                this.f15475b.f15777o = false;
                return;
            case 2:
                gw gwVar = this.f15475b;
                gwVar.f15777o = false;
                gwVar.f15774l = false;
                return;
            case 3:
                this.f15475b.l();
                return;
            default:
                gw gwVar2 = this.f15475b;
                if (!gwVar2.f15777o) {
                    gwVar2.f15777o = true;
                    ArrayList arrayList = new ArrayList(gwVar2.f15772j);
                    hs a02 = hs.a0(gwVar2.f15766a);
                    a02.f15938a.c(new kg(gwVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
