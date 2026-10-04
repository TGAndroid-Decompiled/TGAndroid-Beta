package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4722a;
    public final int f4723b;
    public final int f4724c;
    public final int d;
    public final Object f4725e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4722a = i13;
        this.f4725e = obj;
        this.f4723b = i10;
        this.f4724c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4722a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f4725e).f4796b;
                k8 k8Var = d0Var.f4879n;
                if (k8Var != null) {
                    int i10 = k8Var.f5333k0;
                    int i11 = this.f4723b;
                    int i12 = this.f4724c;
                    int i13 = this.d;
                    if (i10 != i11 || k8Var.f5335l0 != i12 || k8Var.Q != i13) {
                        k8Var.f5333k0 = i11;
                        k8Var.f5335l0 = i12;
                        k8Var.Q = i13;
                        TextureView textureView = d0Var.f4871e;
                        if (textureView != null) {
                            textureView.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ii.x3 x3Var = (ii.x3) this.f4725e;
                View C4 = x3Var.C4(this.f4723b);
                if (C4 instanceof org.telegram.ui.Cells.p9) {
                    x3Var.f12781u3.c0(this.f4724c, this.d, (org.telegram.ui.Cells.p9) C4);
                    return;
                }
                return;
            case 2:
                ii.x3.M1(((ii.m3) this.f4725e).f12523b, this.f4723b, this.f4724c, this.d);
                return;
            default:
                ((MessagesStorage) this.f4725e).lambda$setMessageSeq$211(this.f4723b, this.f4724c, this.d);
                return;
        }
    }
}
