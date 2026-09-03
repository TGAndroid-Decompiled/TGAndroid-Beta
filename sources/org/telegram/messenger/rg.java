package org.telegram.messenger;

import android.view.TextureView;
import android.view.View;
public final class rg implements Runnable {
    public final int f18299a;
    public final int f18300b;
    public final int f18301c;
    public final int d;
    public final Object e;

    public rg(Object obj, int i10, int i11, int i12, int i13) {
        this.f18299a = i13;
        this.e = obj;
        this.f18300b = i10;
        this.f18301c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f18299a) {
            case 0:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f18300b, this.f18301c, this.d);
                return;
            case 1:
                ph.x xVar = (ph.x) ((eg.t2) this.e).f5500b;
                ph.t6 t6Var = xVar.f42562n;
                if (t6Var != null) {
                    int i10 = t6Var.f42422k0;
                    int i11 = this.f18300b;
                    int i12 = this.f18301c;
                    int i13 = this.d;
                    if (i10 != i11 || t6Var.f42424l0 != i12 || t6Var.Q != i13) {
                        t6Var.f42422k0 = i11;
                        t6Var.f42424l0 = i12;
                        t6Var.Q = i13;
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
                vh.s3 s3Var = (vh.s3) this.e;
                View z4 = s3Var.z4(this.f18300b);
                if (z4 instanceof org.telegram.ui.Cells.k9) {
                    s3Var.f46221k3.c0(this.f18301c, this.d, (org.telegram.ui.Cells.k9) z4);
                    return;
                }
                return;
            default:
                vh.s3.J1(((vh.i3) this.e).f46016b, this.f18300b, this.f18301c, this.d);
                return;
        }
    }
}
