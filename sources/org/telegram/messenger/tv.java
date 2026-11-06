package org.telegram.messenger;

import java.util.ArrayList;
public final class tv implements Runnable {
    public final int f25675a;
    public final vv f25676b;

    public tv(vv vvVar, int i7) {
        this.f25675a = i7;
        this.f25676b = vvVar;
    }

    @Override
    public final void run() {
        switch (this.f25675a) {
            case 0:
                this.f25676b.g(false);
                return;
            case 1:
                this.f25676b.f26209o = false;
                return;
            case 2:
                vv vvVar = this.f25676b;
                vvVar.f26209o = false;
                vvVar.f26206l = false;
                return;
            case 3:
                this.f25676b.l();
                return;
            default:
                vv vvVar2 = this.f25676b;
                if (!vvVar2.f26209o) {
                    vvVar2.f26209o = true;
                    ArrayList arrayList = new ArrayList(vvVar2.f26204j);
                    yr a02 = yr.a0(vvVar2.f26197a);
                    a02.f26688a.c(new lg(vvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
