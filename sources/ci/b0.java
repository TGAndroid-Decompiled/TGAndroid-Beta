package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4379a;
    public final int f4380b;
    public final int f4381c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4379a = i13;
        this.e = obj;
        this.f4380b = i10;
        this.f4381c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4379a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f4424b;
                o8 o8Var = d0Var.f4475n;
                if (o8Var != null) {
                    int i10 = o8Var.f5166k0;
                    int i11 = this.f4380b;
                    int i12 = this.f4381c;
                    int i13 = this.d;
                    if (i10 != i11 || o8Var.f5168l0 != i12 || o8Var.Q != i13) {
                        o8Var.f5166k0 = i11;
                        o8Var.f5168l0 = i12;
                        o8Var.Q = i13;
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
                ii.w3 w3Var = (ii.w3) this.e;
                View B4 = w3Var.B4(this.f4380b);
                if (B4 instanceof org.telegram.ui.Cells.q9) {
                    w3Var.f11725n3.c0(this.f4381c, this.d, (org.telegram.ui.Cells.q9) B4);
                    return;
                }
                return;
            case 2:
                ii.w3.L1(((ii.l3) this.e).f11496b, this.f4380b, this.f4381c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f4380b, this.f4381c, this.d);
                return;
        }
    }
}
