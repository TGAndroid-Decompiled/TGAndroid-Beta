package ng;

import org.telegram.ui.bo;
import org.telegram.ui.eg1;
public final class b implements Runnable {
    public final int f15223a;
    public final bo f15224b;

    public b(bo boVar, int i10) {
        this.f15223a = i10;
        this.f15224b = boVar;
    }

    @Override
    public final void run() {
        switch (this.f15223a) {
            case 0:
                bo boVar = this.f15224b;
                if (boVar.getParentLayout() != null) {
                    eg1.I0(boVar);
                    return;
                }
                return;
            default:
                this.f15224b.Yb();
                return;
        }
    }
}
