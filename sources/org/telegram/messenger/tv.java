package org.telegram.messenger;

import java.util.ArrayList;
public final class tv implements Runnable {
    public final int f25688a;
    public final vv f25689b;

    public tv(vv vvVar, int i7) {
        this.f25688a = i7;
        this.f25689b = vvVar;
    }

    @Override
    public final void run() {
        switch (this.f25688a) {
            case 0:
                this.f25689b.g(false);
                return;
            case 1:
                this.f25689b.f26227o = false;
                return;
            case 2:
                vv vvVar = this.f25689b;
                vvVar.f26227o = false;
                vvVar.f26224l = false;
                return;
            case 3:
                this.f25689b.l();
                return;
            default:
                vv vvVar2 = this.f25689b;
                if (!vvVar2.f26227o) {
                    vvVar2.f26227o = true;
                    ArrayList arrayList = new ArrayList(vvVar2.f26222j);
                    yr a02 = yr.a0(vvVar2.f26215a);
                    a02.f26723a.c(new lg(vvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
