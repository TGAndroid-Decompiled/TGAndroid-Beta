package ei;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f8767a;
    public final int f8768b;
    public final int f8769c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f8767a = i13;
        this.e = obj;
        this.f8768b = i10;
        this.f8769c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f8767a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f8808b;
                a8 a8Var = d0Var.f8878n;
                if (a8Var != null) {
                    int i10 = a8Var.f8720k0;
                    int i11 = this.f8768b;
                    int i12 = this.f8769c;
                    int i13 = this.d;
                    if (i10 != i11 || a8Var.f8722l0 != i12 || a8Var.Q != i13) {
                        a8Var.f8720k0 = i11;
                        a8Var.f8722l0 = i12;
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
                View B4 = w3Var.B4(this.f8768b);
                if (B4 instanceof org.telegram.ui.Cells.m9) {
                    w3Var.f15605l3.b0(this.f8769c, this.d, (org.telegram.ui.Cells.m9) B4);
                    return;
                }
                return;
            case 2:
                ki.w3.L1(((ki.l3) this.e).f15377b, this.f8768b, this.f8769c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f8768b, this.f8769c, this.d);
                return;
        }
    }
}
