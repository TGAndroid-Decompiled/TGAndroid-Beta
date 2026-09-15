package ng;

import org.telegram.ui.bo;
import org.telegram.ui.dg1;
public final class b implements Runnable {
    public final int f15225a;
    public final bo f15226b;

    public b(bo boVar, int i10) {
        this.f15225a = i10;
        this.f15226b = boVar;
    }

    @Override
    public final void run() {
        switch (this.f15225a) {
            case 0:
                bo boVar = this.f15226b;
                if (boVar.getParentLayout() != null) {
                    dg1.I0(boVar);
                    return;
                }
                return;
            default:
                this.f15226b.Yb();
                return;
        }
    }
}
