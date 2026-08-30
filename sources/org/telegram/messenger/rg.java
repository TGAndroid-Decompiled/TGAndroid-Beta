package org.telegram.messenger;

import android.view.TextureView;
import android.view.View;
public final class rg implements Runnable {
    public final int f18325a;
    public final int f18326b;
    public final int f18327c;
    public final int d;
    public final Object e;

    public rg(Object obj, int i10, int i11, int i12, int i13) {
        this.f18325a = i13;
        this.e = obj;
        this.f18326b = i10;
        this.f18327c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f18325a) {
            case 0:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f18326b, this.f18327c, this.d);
                return;
            case 1:
                ph.x xVar = (ph.x) ((eg.t2) this.e).f5511b;
                ph.u6 u6Var = xVar.f42528n;
                if (u6Var != null) {
                    int i10 = u6Var.f42421k0;
                    int i11 = this.f18326b;
                    int i12 = this.f18327c;
                    int i13 = this.d;
                    if (i10 != i11 || u6Var.f42423l0 != i12 || u6Var.Q != i13) {
                        u6Var.f42421k0 = i11;
                        u6Var.f42423l0 = i12;
                        u6Var.Q = i13;
                        TextureView textureView = xVar.e;
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
                vh.r3 r3Var = (vh.r3) this.e;
                View A4 = r3Var.A4(this.f18326b);
                if (A4 instanceof org.telegram.ui.Cells.l9) {
                    r3Var.f46124k3.c0(this.f18327c, this.d, (org.telegram.ui.Cells.l9) A4);
                    return;
                }
                return;
            default:
                vh.r3.K1(((vh.h3) this.e).f45919b, this.f18326b, this.f18327c, this.d);
                return;
        }
    }
}
