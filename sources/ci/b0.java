package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4368a;
    public final int f4369b;
    public final int f4370c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4368a = i13;
        this.e = obj;
        this.f4369b = i10;
        this.f4370c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4368a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f4437b;
                k8 k8Var = d0Var.f4515n;
                if (k8Var != null) {
                    int i10 = k8Var.f4943k0;
                    int i11 = this.f4369b;
                    int i12 = this.f4370c;
                    int i13 = this.d;
                    if (i10 != i11 || k8Var.f4945l0 != i12 || k8Var.Q != i13) {
                        k8Var.f4943k0 = i11;
                        k8Var.f4945l0 = i12;
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
                ii.x3 x3Var = (ii.x3) this.e;
                View B4 = x3Var.B4(this.f4369b);
                if (B4 instanceof org.telegram.ui.Cells.p9) {
                    x3Var.f11741n3.c0(this.f4370c, this.d, (org.telegram.ui.Cells.p9) B4);
                    return;
                }
                return;
            case 2:
                ii.x3.L1(((ii.m3) this.e).f11504b, this.f4369b, this.f4370c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f4369b, this.f4370c, this.d);
                return;
        }
    }
}
