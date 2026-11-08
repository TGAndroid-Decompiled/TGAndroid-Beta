package org.telegram.messenger;

import java.util.ArrayList;
public final class tv implements Runnable {
    public final int f25684a;
    public final vv f25685b;

    public tv(vv vvVar, int i7) {
        this.f25684a = i7;
        this.f25685b = vvVar;
    }

    @Override
    public final void run() {
        switch (this.f25684a) {
            case 0:
                this.f25685b.g(false);
                return;
            case 1:
                this.f25685b.f26223o = false;
                return;
            case 2:
                vv vvVar = this.f25685b;
                vvVar.f26223o = false;
                vvVar.f26220l = false;
                return;
            case 3:
                this.f25685b.l();
                return;
            default:
                vv vvVar2 = this.f25685b;
                if (!vvVar2.f26223o) {
                    vvVar2.f26223o = true;
                    ArrayList arrayList = new ArrayList(vvVar2.f26218j);
                    yr a02 = yr.a0(vvVar2.f26211a);
                    a02.f26719a.c(new lg(vvVar2, a02, arrayList, 24));
                    return;
                }
                return;
        }
    }
}
