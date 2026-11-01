package org.telegram.messenger;
public final class bc implements Runnable {
    public final int f14953a;
    public final dc f14954b;
    public final Boolean f14955c;

    public bc(dc dcVar, Boolean bool, int i10) {
        this.f14953a = i10;
        this.f14954b = dcVar;
        this.f14955c = bool;
    }

    @Override
    public final void run() {
        int i10 = this.f14953a;
        Boolean bool = this.f14955c;
        dc dcVar = this.f14954b;
        switch (i10) {
            case 0:
                dcVar.h.f16263u.remove(dcVar.f15336a.e);
                i0.g3(new bc(dcVar, bool, 1));
                return;
            default:
                wb wbVar = dcVar.f15336a;
                if (bool.booleanValue()) {
                    at.f(wbVar.f19020o).k(142, wbVar.e, wbVar.f19021p);
                    return;
                } else {
                    at.f(wbVar.f19020o).k(143, wbVar.e, 2);
                    return;
                }
        }
    }
}
