package bi;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class g0 implements Runnable {
    public final int f2732a;
    public final int f2733b;
    public final int f2734c;
    public final int d;
    public final Object e;

    public g0(Object obj, int i10, int i11, int i12, int i13) {
        this.f2732a = i13;
        this.e = obj;
        this.f2733b = i10;
        this.f2734c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f2732a) {
            case 0:
                i0 i0Var = (i0) ((h0) this.e).f2776b;
                r9 r9Var = i0Var.f2835n;
                if (r9Var != null) {
                    int i10 = r9Var.f3582k0;
                    int i11 = this.f2733b;
                    int i12 = this.f2734c;
                    int i13 = this.d;
                    if (i10 != i11 || r9Var.f3584l0 != i12 || r9Var.Q != i13) {
                        r9Var.f3582k0 = i11;
                        r9Var.f3584l0 = i12;
                        r9Var.Q = i13;
                        TextureView textureView = i0Var.e;
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
                hi.z3 z3Var = (hi.z3) this.e;
                View z42 = z3Var.z4(this.f2733b);
                if (z42 instanceof org.telegram.ui.Cells.r9) {
                    z3Var.f10011n3.c0(this.f2734c, this.d, (org.telegram.ui.Cells.r9) z42);
                    return;
                }
                return;
            case 2:
                hi.z3.J1(((hi.o3) this.e).f9776b, this.f2733b, this.f2734c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f2733b, this.f2734c, this.d);
                return;
        }
    }
}
