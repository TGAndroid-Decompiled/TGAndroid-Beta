package di;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f6645a;
    public final int f6646b;
    public final int f6647c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f6645a = i13;
        this.e = obj;
        this.f6646b = i10;
        this.f6647c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f6645a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f6681b;
                k8 k8Var = d0Var.f6775n;
                if (k8Var != null) {
                    int i10 = k8Var.f7195k0;
                    int i11 = this.f6646b;
                    int i12 = this.f6647c;
                    int i13 = this.d;
                    if (i10 != i11 || k8Var.f7197l0 != i12 || k8Var.Q != i13) {
                        k8Var.f7195k0 = i11;
                        k8Var.f7197l0 = i12;
                        k8Var.Q = i13;
                        TextureView textureView = d0Var.e;
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
                ji.x3 x3Var = (ji.x3) this.e;
                View B4 = x3Var.B4(this.f6646b);
                if (B4 instanceof org.telegram.ui.Cells.n9) {
                    x3Var.f13639l3.b0(this.f6647c, this.d, (org.telegram.ui.Cells.n9) B4);
                    return;
                }
                return;
            case 2:
                ji.x3.L1(((ji.m3) this.e).f13406b, this.f6646b, this.f6647c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f6646b, this.f6647c, this.d);
                return;
        }
    }
}
