package org.telegram.messenger;

import java.util.ArrayList;
public final class tv implements Runnable {
    public final int f25683a;
    public final vv f25684b;

    public tv(vv vvVar, int i7) {
        this.f25683a = i7;
        this.f25684b = vvVar;
    }

    @Override
    public final void run() {
        switch (this.f25683a) {
            case 0:
                this.f25684b.g(false);
                return;
            case 1:
                this.f25684b.f26217o = false;
                return;
            case 2:
                vv vvVar = this.f25684b;
                vvVar.f26217o = false;
                vvVar.f26214l = false;
                return;
            case 3:
                this.f25684b.l();
                return;
            default:
                vv vvVar2 = this.f25684b;
                if (!vvVar2.f26217o) {
                    vvVar2.f26217o = true;
                    ArrayList arrayList = new ArrayList(vvVar2.f26212j);
                    yr a02 = yr.a0(vvVar2.f26205a);
                    a02.f26696a.c(new lg(vvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
