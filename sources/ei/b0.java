package ei;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f8764a;
    public final int f8765b;
    public final int f8766c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f8764a = i13;
        this.e = obj;
        this.f8765b = i10;
        this.f8766c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f8764a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f8805b;
                a8 a8Var = d0Var.f8875n;
                if (a8Var != null) {
                    int i10 = a8Var.f8717k0;
                    int i11 = this.f8765b;
                    int i12 = this.f8766c;
                    int i13 = this.d;
                    if (i10 != i11 || a8Var.f8719l0 != i12 || a8Var.Q != i13) {
                        a8Var.f8717k0 = i11;
                        a8Var.f8719l0 = i12;
                        a8Var.Q = i13;
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
                ki.w3 w3Var = (ki.w3) this.e;
                View B4 = w3Var.B4(this.f8765b);
                if (B4 instanceof org.telegram.ui.Cells.m9) {
                    w3Var.f15604l3.b0(this.f8766c, this.d, (org.telegram.ui.Cells.m9) B4);
                    return;
                }
                return;
            case 2:
                ki.w3.L1(((ki.l3) this.e).f15376b, this.f8765b, this.f8766c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f8765b, this.f8766c, this.d);
                return;
        }
    }
}
