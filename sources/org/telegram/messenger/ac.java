package org.telegram.messenger;
public final class ac implements Runnable {
    public final int f14589a;
    public final dc f14590b;

    public ac(dc dcVar, int i10) {
        this.f14589a = i10;
        this.f14590b = dcVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14589a;
        dc dcVar = this.f14590b;
        switch (i10) {
            case 0:
                ic icVar = dcVar.h;
                ThreadLocal threadLocal = ic.I;
                icVar.V(true);
                return;
            case 1:
                dcVar.h.f16263u.remove(dcVar.f15336a.e);
                i0.g3(new ac(dcVar, 3));
                return;
            case 2:
                ic icVar2 = dcVar.h;
                ThreadLocal threadLocal2 = ic.I;
                icVar2.V(true);
                return;
            default:
                wb wbVar = dcVar.f15336a;
                at.f(wbVar.f19020o).k(143, wbVar.e, 1);
                return;
        }
    }
}
