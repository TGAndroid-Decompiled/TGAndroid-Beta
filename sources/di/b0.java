package di;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f6648a;
    public final int f6649b;
    public final int f6650c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f6648a = i13;
        this.e = obj;
        this.f6649b = i10;
        this.f6650c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f6648a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f6684b;
                k8 k8Var = d0Var.f6778n;
                if (k8Var != null) {
                    int i10 = k8Var.f7198k0;
                    int i11 = this.f6649b;
                    int i12 = this.f6650c;
                    int i13 = this.d;
                    if (i10 != i11 || k8Var.f7200l0 != i12 || k8Var.Q != i13) {
                        k8Var.f7198k0 = i11;
                        k8Var.f7200l0 = i12;
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
                View B4 = x3Var.B4(this.f6649b);
                if (B4 instanceof org.telegram.ui.Cells.n9) {
                    x3Var.f13642l3.b0(this.f6650c, this.d, (org.telegram.ui.Cells.n9) B4);
                    return;
                }
                return;
            case 2:
                ji.x3.L1(((ji.m3) this.e).f13409b, this.f6649b, this.f6650c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f6649b, this.f6650c, this.d);
                return;
        }
    }
}
