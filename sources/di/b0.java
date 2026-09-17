package di;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f6958a;
    public final int f6959b;
    public final int f6960c;
    public final int d;
    public final Object f6961e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f6958a = i13;
        this.f6961e = obj;
        this.f6959b = i10;
        this.f6960c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f6958a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.f6961e).f7010b;
                o8 o8Var = d0Var.f7064n;
                if (o8Var != null) {
                    int i10 = o8Var.f7792k0;
                    int i11 = this.f6959b;
                    int i12 = this.f6960c;
                    int i13 = this.d;
                    if (i10 != i11 || o8Var.f7794l0 != i12 || o8Var.Q != i13) {
                        o8Var.f7792k0 = i11;
                        o8Var.f7794l0 = i12;
                        o8Var.Q = i13;
                        TextureView textureView = d0Var.f7056e;
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
                ji.v3 v3Var = (ji.v3) this.f6961e;
                View z42 = v3Var.z4(this.f6959b);
                if (z42 instanceof org.telegram.ui.Cells.p9) {
                    v3Var.f14285n3.c0(this.f6960c, this.d, (org.telegram.ui.Cells.p9) z42);
                    return;
                }
                return;
            case 2:
                ji.v3.J1(((ji.k3) this.f6961e).f14042b, this.f6959b, this.f6960c, this.d);
                return;
            default:
                ((MessagesStorage) this.f6961e).lambda$setMessageSeq$211(this.f6959b, this.f6960c, this.d);
                return;
        }
    }
}
