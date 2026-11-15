package org.telegram.messenger;

import java.util.ArrayList;
public final class rv implements Runnable {
    public final int f26357a;
    public final tv f26358b;

    public rv(tv tvVar, int i7) {
        this.f26357a = i7;
        this.f26358b = tvVar;
    }

    @Override
    public final void run() {
        switch (this.f26357a) {
            case 0:
                this.f26358b.g(false);
                return;
            case 1:
                this.f26358b.f26745o = false;
                return;
            case 2:
                tv tvVar = this.f26358b;
                tvVar.f26745o = false;
                tvVar.f26742l = false;
                return;
            case 3:
                this.f26358b.l();
                return;
            default:
                tv tvVar2 = this.f26358b;
                if (!tvVar2.f26745o) {
                    tvVar2.f26745o = true;
                    ArrayList arrayList = new ArrayList(tvVar2.f26740j);
                    vr a02 = vr.a0(tvVar2.f26733a);
                    a02.f27220a.c(new kg(tvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
