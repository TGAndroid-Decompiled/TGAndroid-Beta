package org.telegram.messenger;

import java.util.ArrayList;
public final class lv implements Runnable {
    public final int f24127a;
    public final nv f24128b;

    public lv(nv nvVar, int i3) {
        this.f24127a = i3;
        this.f24128b = nvVar;
    }

    @Override
    public final void run() {
        switch (this.f24127a) {
            case 0:
                this.f24128b.g(false);
                return;
            case 1:
                this.f24128b.f24446o = false;
                return;
            case 2:
                nv nvVar = this.f24128b;
                nvVar.f24446o = false;
                nvVar.f24443l = false;
                return;
            case 3:
                this.f24128b.l();
                return;
            default:
                nv nvVar2 = this.f24128b;
                if (!nvVar2.f24446o) {
                    nvVar2.f24446o = true;
                    ArrayList arrayList = new ArrayList(nvVar2.f24441j);
                    qr a02 = qr.a0(nvVar2.f24434a);
                    a02.f24934a.c(new dg(nvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
