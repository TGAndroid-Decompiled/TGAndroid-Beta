package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4723a;
    public final int f4724b;
    public final int f4725c;
    public final int d;
    public final Object f4726e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4723a = i13;
        this.f4726e = obj;
        this.f4724b = i10;
        this.f4725c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4723a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f4726e).f4797b;
                k8 k8Var = d0Var.f4880n;
                if (k8Var != null) {
                    int i10 = k8Var.f5334k0;
                    int i11 = this.f4724b;
                    int i12 = this.f4725c;
                    int i13 = this.d;
                    if (i10 != i11 || k8Var.f5336l0 != i12 || k8Var.Q != i13) {
                        k8Var.f5334k0 = i11;
                        k8Var.f5336l0 = i12;
                        k8Var.Q = i13;
                        TextureView textureView = d0Var.f4872e;
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
                ii.x3 x3Var = (ii.x3) this.f4726e;
                View C4 = x3Var.C4(this.f4724b);
                if (C4 instanceof org.telegram.ui.Cells.p9) {
                    x3Var.f12782u3.c0(this.f4725c, this.d, (org.telegram.ui.Cells.p9) C4);
                    return;
                }
                return;
            case 2:
                ii.x3.M1(((ii.m3) this.f4726e).f12524b, this.f4724b, this.f4725c, this.d);
                return;
            default:
                ((MessagesStorage) this.f4726e).lambda$setMessageSeq$211(this.f4724b, this.f4725c, this.d);
                return;
        }
    }
}
