package fi;

import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
public final class p0 implements Runnable {
    public final int f9157a = 0;
    public final bo f9158b;
    public final boolean f9159c;
    public final int d;

    public p0(int i10, bo boVar, boolean z10) {
        this.d = i10;
        this.f9158b = boVar;
        this.f9159c = z10;
    }

    @Override
    public final void run() {
        switch (this.f9157a) {
            case 0:
                int i10 = this.d;
                bo boVar = this.f9158b;
                if (i10 != 2) {
                    boVar.U9();
                    boVar.Yb();
                }
                u0.f(vc.a0(boVar), i10, this.f9159c);
                return;
            default:
                boolean z10 = this.f9159c;
                this.f9158b.yc(this.d, z10);
                return;
        }
    }

    public p0(bo boVar, boolean z10, int i10) {
        this.f9158b = boVar;
        this.f9159c = z10;
        this.d = i10;
    }
}
