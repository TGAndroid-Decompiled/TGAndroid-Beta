package org.telegram.messenger;

import java.util.ArrayList;
public final class rv implements Runnable {
    public final int f26367a;
    public final tv f26368b;

    public rv(tv tvVar, int i7) {
        this.f26367a = i7;
        this.f26368b = tvVar;
    }

    @Override
    public final void run() {
        switch (this.f26367a) {
            case 0:
                this.f26368b.g(false);
                return;
            case 1:
                this.f26368b.f26747o = false;
                return;
            case 2:
                tv tvVar = this.f26368b;
                tvVar.f26747o = false;
                tvVar.f26744l = false;
                return;
            case 3:
                this.f26368b.l();
                return;
            default:
                tv tvVar2 = this.f26368b;
                if (!tvVar2.f26747o) {
                    tvVar2.f26747o = true;
                    ArrayList arrayList = new ArrayList(tvVar2.f26742j);
                    vr a02 = vr.a0(tvVar2.f26735a);
                    a02.f27219a.c(new kg(tvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
