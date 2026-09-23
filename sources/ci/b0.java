package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4364a;
    public final int f4365b;
    public final int f4366c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4364a = i13;
        this.e = obj;
        this.f4365b = i10;
        this.f4366c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4364a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f4429b;
                l8 l8Var = d0Var.f4488n;
                if (l8Var != null) {
                    int i10 = l8Var.f4987k0;
                    int i11 = this.f4365b;
                    int i12 = this.f4366c;
                    int i13 = this.d;
                    if (i10 != i11 || l8Var.f4989l0 != i12 || l8Var.Q != i13) {
                        l8Var.f4987k0 = i11;
                        l8Var.f4989l0 = i12;
                        l8Var.Q = i13;
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
                View A4 = x3Var.A4(this.f4365b);
                if (A4 instanceof org.telegram.ui.Cells.q9) {
                    x3Var.f11738n3.c0(this.f4366c, this.d, (org.telegram.ui.Cells.q9) A4);
                    return;
                }
                return;
            case 2:
                ii.x3.K1(((ii.m3) this.e).f11501b, this.f4365b, this.f4366c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f4365b, this.f4366c, this.d);
                return;
        }
    }
}
