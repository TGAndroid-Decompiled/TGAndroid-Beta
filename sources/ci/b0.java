package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4373a;
    public final int f4374b;
    public final int f4375c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4373a = i13;
        this.e = obj;
        this.f4374b = i10;
        this.f4375c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4373a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f4418b;
                o8 o8Var = d0Var.f4469n;
                if (o8Var != null) {
                    int i10 = o8Var.f5160k0;
                    int i11 = this.f4374b;
                    int i12 = this.f4375c;
                    int i13 = this.d;
                    if (i10 != i11 || o8Var.f5162l0 != i12 || o8Var.Q != i13) {
                        o8Var.f5160k0 = i11;
                        o8Var.f5162l0 = i12;
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
                View A4 = w3Var.A4(this.f4374b);
                if (A4 instanceof org.telegram.ui.Cells.p9) {
                    w3Var.f11721n3.c0(this.f4375c, this.d, (org.telegram.ui.Cells.p9) A4);
                    return;
                }
                return;
            case 2:
                ii.w3.K1(((ii.l3) this.e).f11492b, this.f4374b, this.f4375c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f4374b, this.f4375c, this.d);
                return;
        }
    }
}
