package di;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f6930a;
    public final int f6931b;
    public final int f6932c;
    public final int d;
    public final Object f6933e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f6930a = i13;
        this.f6933e = obj;
        this.f6931b = i10;
        this.f6932c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f6930a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f6933e).f6982b;
                o8 o8Var = d0Var.f7036n;
                if (o8Var != null) {
                    int i10 = o8Var.f7764k0;
                    int i11 = this.f6931b;
                    int i12 = this.f6932c;
                    int i13 = this.d;
                    if (i10 != i11 || o8Var.f7766l0 != i12 || o8Var.Q != i13) {
                        o8Var.f7764k0 = i11;
                        o8Var.f7766l0 = i12;
                        o8Var.Q = i13;
                        TextureView textureView = d0Var.f7028e;
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
                ji.v3 v3Var = (ji.v3) this.f6933e;
                View z42 = v3Var.z4(this.f6931b);
                if (z42 instanceof org.telegram.ui.Cells.p9) {
                    v3Var.f14259n3.c0(this.f6932c, this.d, (org.telegram.ui.Cells.p9) z42);
                    return;
                }
                return;
            case 2:
                ji.v3.J1(((ji.k3) this.f6933e).f14016b, this.f6931b, this.f6932c, this.d);
                return;
            default:
                ((MessagesStorage) this.f6933e).lambda$setMessageSeq$211(this.f6931b, this.f6932c, this.d);
                return;
        }
    }
}
