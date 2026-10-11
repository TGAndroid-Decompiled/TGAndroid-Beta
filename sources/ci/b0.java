package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4741a;
    public final int f4742b;
    public final int f4743c;
    public final int d;
    public final Object f4744e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4741a = i13;
        this.f4744e = obj;
        this.f4742b = i10;
        this.f4743c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4741a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f4744e).f4810b;
                l8 l8Var = d0Var.f4889n;
                if (l8Var != null) {
                    int i10 = l8Var.f5417k0;
                    int i11 = this.f4742b;
                    int i12 = this.f4743c;
                    int i13 = this.d;
                    if (i10 != i11 || l8Var.f5419l0 != i12 || l8Var.Q != i13) {
                        l8Var.f5417k0 = i11;
                        l8Var.f5419l0 = i12;
                        l8Var.Q = i13;
                        TextureView textureView = d0Var.f4881e;
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
                ii.x3 x3Var = (ii.x3) this.f4744e;
                View B4 = x3Var.B4(this.f4742b);
                if (B4 instanceof org.telegram.ui.Cells.n9) {
                    x3Var.f12819l3.b0(this.f4743c, this.d, (org.telegram.ui.Cells.n9) B4);
                    return;
                }
                return;
            case 2:
                ii.x3.L1(((ii.m3) this.f4744e).f12568b, this.f4742b, this.f4743c, this.d);
                return;
            default:
                ((MessagesStorage) this.f4744e).lambda$setMessageSeq$211(this.f4742b, this.f4743c, this.d);
                return;
        }
    }
}
