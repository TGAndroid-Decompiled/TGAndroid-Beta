package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4740a;
    public final int f4741b;
    public final int f4742c;
    public final int d;
    public final Object f4743e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4740a = i13;
        this.f4743e = obj;
        this.f4741b = i10;
        this.f4742c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4740a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f4743e).f4809b;
                l8 l8Var = d0Var.f4888n;
                if (l8Var != null) {
                    int i10 = l8Var.f5416k0;
                    int i11 = this.f4741b;
                    int i12 = this.f4742c;
                    int i13 = this.d;
                    if (i10 != i11 || l8Var.f5418l0 != i12 || l8Var.Q != i13) {
                        l8Var.f5416k0 = i11;
                        l8Var.f5418l0 = i12;
                        l8Var.Q = i13;
                        TextureView textureView = d0Var.f4880e;
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
                ii.x3 x3Var = (ii.x3) this.f4743e;
                View B4 = x3Var.B4(this.f4741b);
                if (B4 instanceof org.telegram.ui.Cells.n9) {
                    x3Var.f12818l3.b0(this.f4742c, this.d, (org.telegram.ui.Cells.n9) B4);
                    return;
                }
                return;
            case 2:
                ii.x3.L1(((ii.m3) this.f4743e).f12571b, this.f4741b, this.f4742c, this.d);
                return;
            default:
                ((MessagesStorage) this.f4743e).lambda$setMessageSeq$211(this.f4741b, this.f4742c, this.d);
                return;
        }
    }
}
