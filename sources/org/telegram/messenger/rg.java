package org.telegram.messenger;

import android.view.TextureView;
import android.view.View;
public final class rg implements Runnable {
    public final int f19895a;
    public final int f19896b;
    public final int f19897c;
    public final int d;
    public final Object f19898e;

    public rg(Object obj, int i10, int i11, int i12, int i13) {
        this.f19895a = i13;
        this.f19898e = obj;
        this.f19896b = i10;
        this.f19897c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f19895a) {
            case 0:
                ((MessagesStorage) this.f19898e).lambda$setMessageSeq$211(this.f19896b, this.f19897c, this.d);
                return;
            case 1:
                qh.x xVar = (qh.x) ((fg.s2) this.f19898e).f6550b;
                qh.s6 s6Var = xVar.f46255n;
                if (s6Var != null) {
                    int i10 = s6Var.f46065k0;
                    int i11 = this.f19896b;
                    int i12 = this.f19897c;
                    int i13 = this.d;
                    if (i10 != i11 || s6Var.f46067l0 != i12 || s6Var.Q != i13) {
                        s6Var.f46065k0 = i11;
                        s6Var.f46067l0 = i12;
                        s6Var.Q = i13;
                        TextureView textureView = xVar.f46247e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wh.r3 r3Var = (wh.r3) this.f19898e;
                View A4 = r3Var.A4(this.f19896b);
                if (A4 instanceof org.telegram.ui.Cells.l9) {
                    r3Var.f49992k3.c0(this.f19897c, this.d, (org.telegram.ui.Cells.l9) A4);
                    return;
                }
                return;
            default:
                wh.r3.K1(((wh.h3) this.f19898e).f49772b, this.f19896b, this.f19897c, this.d);
                return;
        }
    }
}
