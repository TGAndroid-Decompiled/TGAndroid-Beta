package org.telegram.messenger;

import android.view.TextureView;
import android.view.View;
public final class rg implements Runnable {
    public final int f19897a;
    public final int f19898b;
    public final int f19899c;
    public final int d;
    public final Object f19900e;

    public rg(Object obj, int i10, int i11, int i12, int i13) {
        this.f19897a = i13;
        this.f19900e = obj;
        this.f19898b = i10;
        this.f19899c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f19897a) {
            case 0:
                ((MessagesStorage) this.f19900e).lambda$setMessageSeq$211(this.f19898b, this.f19899c, this.d);
                return;
            case 1:
                qh.x xVar = (qh.x) ((fg.s2) this.f19900e).f6550b;
                qh.r6 r6Var = xVar.f46295n;
                if (r6Var != null) {
                    int i10 = r6Var.f46016k0;
                    int i11 = this.f19898b;
                    int i12 = this.f19899c;
                    int i13 = this.d;
                    if (i10 != i11 || r6Var.f46018l0 != i12 || r6Var.Q != i13) {
                        r6Var.f46016k0 = i11;
                        r6Var.f46018l0 = i12;
                        r6Var.Q = i13;
                        TextureView textureView = xVar.f46287e;
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
                wh.r3 r3Var = (wh.r3) this.f19900e;
                View z4 = r3Var.z4(this.f19898b);
                if (z4 instanceof org.telegram.ui.Cells.l9) {
                    r3Var.f50028k3.c0(this.f19899c, this.d, (org.telegram.ui.Cells.l9) z4);
                    return;
                }
                return;
            default:
                wh.r3.J1(((wh.h3) this.f19900e).f49808b, this.f19898b, this.f19899c, this.d);
                return;
        }
    }
}
