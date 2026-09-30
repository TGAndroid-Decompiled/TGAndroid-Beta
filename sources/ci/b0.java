package ci;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class b0 implements Runnable {
    public final int f4371a;
    public final int f4372b;
    public final int f4373c;
    public final int d;
    public final Object e;

    public b0(Object obj, int i10, int i11, int i12, int i13) {
        this.f4371a = i13;
        this.e = obj;
        this.f4372b = i10;
        this.f4373c = i11;
        this.d = i12;
    }

    @Override
    public final void run() {
        switch (this.f4371a) {
            case 0:
                d0 d0Var = (d0) ((c0) this.e).f4436b;
                l8 l8Var = d0Var.f4495n;
                if (l8Var != null) {
                    int i10 = l8Var.f4994k0;
                    int i11 = this.f4372b;
                    int i12 = this.f4373c;
                    int i13 = this.d;
                    if (i10 != i11 || l8Var.f4996l0 != i12 || l8Var.Q != i13) {
                        l8Var.f4994k0 = i11;
                        l8Var.f4996l0 = i12;
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
                View C4 = x3Var.C4(this.f4372b);
                if (C4 instanceof org.telegram.ui.Cells.p9) {
                    x3Var.f11760u3.c0(this.f4373c, this.d, (org.telegram.ui.Cells.p9) C4);
                    return;
                }
                return;
            case 2:
                ii.x3.M1(((ii.m3) this.e).f11515b, this.f4372b, this.f4373c, this.d);
                return;
            default:
                ((MessagesStorage) this.e).lambda$setMessageSeq$211(this.f4372b, this.f4373c, this.d);
                return;
        }
    }
}
