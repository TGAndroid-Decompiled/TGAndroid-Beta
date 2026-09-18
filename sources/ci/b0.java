package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4378a;
    public final int f4379b;
    public final int f4380c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4378a = i13;
        this.e = obj;
        this.f4379b = i10;
        this.f4380c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4378a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f4423b;
                o8 o8Var = d0Var.f4474n;
                if (o8Var != null) {
                    int i10 = o8Var.f5165k0;
                    int i11 = this.f4379b;
                    int i12 = this.f4380c;
                    int i13 = this.d;
                    if (i10 != i11 || o8Var.f5167l0 != i12 || o8Var.Q != i13) {
                        o8Var.f5165k0 = i11;
                        o8Var.f5167l0 = i12;
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
                View B4 = w3Var.B4(this.f4379b);
                if (B4 instanceof org.telegram.ui.Cells.p9) {
                    w3Var.f11724n3.c0(this.f4380c, this.d, (org.telegram.ui.Cells.p9) B4);
                    return;
                }
                return;
            case 2:
                ii.w3.L1(((ii.l3) this.e).f11495b, this.f4379b, this.f4380c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f4379b, this.f4380c, this.d);
                return;
        }
    }
}
