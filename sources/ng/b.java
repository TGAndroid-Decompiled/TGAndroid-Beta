package ng;

import org.telegram.ui.bo;
import org.telegram.ui.fg1;
public final class b implements Runnable {
    public final int f15235a;
    public final bo f15236b;

    public b(bo boVar, int i10) {
        this.f15235a = i10;
        this.f15236b = boVar;
    }

    @Override
    public final void run() {
        switch (this.f15235a) {
            case 0:
                bo boVar = this.f15236b;
                if (boVar.getParentLayout() != null) {
                    fg1.I0(boVar);
                    return;
                }
                return;
            default:
                this.f15236b.Yb();
                return;
        }
    }
}
