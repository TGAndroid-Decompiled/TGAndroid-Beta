package kh;

import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.MessagesStorage;
public final class c0 implements Runnable {
    public final int f15024a;
    public final int f15025b;
    public final int f15026c;
    public final int d;
    public final Object f15027e;

    public c0(Object obj, int i9, int i10, int i11, int i12) {
        this.f15024a = i12;
        this.f15027e = obj;
        this.f15025b = i9;
        this.f15026c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f15024a) {
            case 0:
                e0 e0Var = (e0) ((d0) this.f15027e).f15078b;
                a8 a8Var = e0Var.f15140n;
                if (a8Var != null) {
                    int i9 = a8Var.f14925k0;
                    int i10 = this.f15025b;
                    int i11 = this.f15026c;
                    int i12 = this.d;
                    if (i9 != i10 || a8Var.f14927l0 != i11 || a8Var.Q != i12) {
                        a8Var.f14925k0 = i10;
                        a8Var.f14927l0 = i11;
                        a8Var.Q = i12;
                        TextureView textureView = e0Var.f15132e;
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
                ((MessagesStorage) this.f15027e).lambda$setMessageSeq$211(this.f15025b, this.f15026c, this.d);
                return;
            case 2:
                qh.o3 o3Var = (qh.o3) this.f15027e;
                View A4 = o3Var.A4(this.f15025b);
                if (A4 instanceof org.telegram.ui.Cells.m9) {
                    o3Var.f46577j3.c0(this.f15026c, this.d, (org.telegram.ui.Cells.m9) A4);
                    return;
                }
                return;
            default:
                qh.o3.K1(((qh.e3) this.f15027e).f46366b, this.f15025b, this.f15026c, this.d);
                return;
        }
    }
}
